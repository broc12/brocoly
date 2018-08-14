package com.khd.jejulantis.client.review.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.khd.jejulantis.admin.review.Service.ReviewService;
import com.khd.jejulantis.client.Reserv.Service.ReservService;
import com.khd.jejulantis.client.review.Service.CReviewService;
import com.khd.jejulantis.model.BranchName;
import com.khd.jejulantis.model.Reserv;
import com.khd.jejulantis.model.ReviewContent;

@Controller
public class CReviewController {
	
	@Autowired
	private CReviewService crservice;
	@Autowired
	private ReviewService rservice;
	@Autowired
	ReservService reservService;
	
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
		rservice.reviewInsertService(reviewContent);
		int member_no = reviewContent.getMember_no();
		return "redirect:check.do?member_no="+member_no;
	}
}
