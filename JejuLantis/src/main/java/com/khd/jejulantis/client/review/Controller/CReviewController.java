package com.khd.jejulantis.client.review.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.khd.jejulantis.admin.branch.Service.BranchService;
import com.khd.jejulantis.admin.car.Service.CarService;
import com.khd.jejulantis.admin.cardetail.Service.CarkindDetailService;
import com.khd.jejulantis.admin.review.Service.ReviewService;
import com.khd.jejulantis.client.Reserv.Service.ReservService;
import com.khd.jejulantis.client.review.Service.CReviewService;
import com.khd.jejulantis.model.Branch;
import com.khd.jejulantis.model.BranchName;
import com.khd.jejulantis.model.Car;
import com.khd.jejulantis.model.CarkindDetail;
import com.khd.jejulantis.model.Reserv;
import com.khd.jejulantis.model.ReviewContent;

@Controller
public class CReviewController {
	
	@Autowired
	private CReviewService crservice;
	@Autowired
	private ReviewService rservice;
	@Autowired
	private ReservService reservService;
	@Autowired
	private CarkindDetailService carkinddetailService;
	@Autowired
	private BranchService branchService;
	@Autowired
	private CarService carService;
	@RequestMapping(value="board.do")
	public ModelAndView board(@RequestParam(value ="searchValue", required= false)String searchValue){
		List<BranchName> branch = null;
		if(searchValue == null) {
			branch = crservice.listService();
		}else if(searchValue != null){
			branch = crservice.selectService(searchValue);
		}
		String view = "rentcar/reviews/board";
		ModelAndView mv = new ModelAndView(view, "branch", branch);
		return mv;
	}	
	
	@RequestMapping(value="boardview.do")
	public ModelAndView reviewContent(@RequestParam(value ="branch_no")int branch_no){
		String view = "rentcar/reviews/boardview";
		List<BranchName> branchContent = crservice.listServiceAll(branch_no);
		double number = Double.parseDouble(String.format("%.1f",branchContent.get(0).getScore()));
		branchContent.get(0).setScore(number);
		ModelAndView mv = new ModelAndView(view, "branchContent", branchContent);
		return mv;
	}
	@RequestMapping(value="test.do")
	public String test(){
		return "rentcar/reviews/test";
	}
	@RequestMapping(value="test1.do",method=RequestMethod.POST)
	public String test1(
			@RequestParam("branch_lati")String branch_lati,
			@RequestParam("branch_long")String branch_long){
		System.out.println("branch_lati : " + branch_lati);
		System.out.println("branch_long : " + branch_long);
		return "rentcar/reviews/test1";
	}
	@RequestMapping(value="reviewInsert.do")
	public ModelAndView reviewInsert(@RequestParam("rent_reserv_no")long rent_reserv_no){
		Reserv list = reservService.reservListService(rent_reserv_no);
		String view = "rentcar/reviews/reviewInsert";
		ModelAndView mv = new ModelAndView(view, "list",list);
		return mv;
//		return "rentcar/reviews/reviewInsert";
	}
	@RequestMapping(value="reviewInsertOk.do",method=RequestMethod.POST)
	public String reviewInsertOk(ReviewContent reviewContent){
		double rent_review_rating_car = reviewContent.getRent_review_rating_car();
		System.out.println("carkind");
		
		int car_kind_count = rservice.getCarkindCount(reviewContent.getCar_kind_no());
		List<CarkindDetail> car_kind_rating = carkinddetailService.contentListService(reviewContent.getCar_kind_no());
		System.out.println("car_kind_rating : " + car_kind_rating.get(0).getCar_kind_rating());
		double car_kind_set = (car_kind_rating.get(0).getCar_kind_rating()+rent_review_rating_car)/car_kind_count;
		System.out.println("car_kind_set : " + car_kind_set);
		double car_kind_set1 = Double.parseDouble(String.format("%.1f",car_kind_set));
		System.out.println("car_kind_set1 : " + car_kind_set1);
		carkinddetailService.UpdateService(reviewContent.getCar_kind_no(), car_kind_set1);
		
		int car_count = rservice.getCarCount(reviewContent.getCar_no());
		List<Car> car_rating = carService.subjectService(reviewContent.getCar_no());
		double car_set = (car_rating.get(0).getCar_rating()+rent_review_rating_car)/car_count;
		System.out.println("car_set : " + car_set);
		double car_set1 = Double.parseDouble(String.format("%.1f",car_set));
		System.out.println("car_set1 : " + car_set1);
		carService.updateService(reviewContent.getCar_no(), car_set1);
		
		int branch_count = rservice.getBranchCount(reviewContent.getBranch_no());
		List<Branch> branch_rating = branchService.subjectService(reviewContent.getBranch_no());
		double branch_set = (branch_rating.get(0).getBranch_rating()+rent_review_rating_car)/branch_count;
		System.out.println("branch_set : " + branch_set);
		double branch_set1 = Double.parseDouble(String.format("%.1f",branch_set));
		System.out.println("branch_set1 : " + branch_set1);
		branchService.modifyService(reviewContent.getBranch_no(), branch_set1);
		
		rservice.reviewInsertService(reviewContent);
		int member_no = reviewContent.getMember_no();
		return "redirect:check.do?member_no="+member_no;
	}
}
