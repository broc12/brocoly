package com.khd.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.khd.CarkindController.Carkind;
import com.khd.CarkindController.CarkindService;
import com.khd.ReviewController.ReviewContent;
import com.khd.ReviewController.ReviewService;


@Controller
public class AdminController {
	
	@Autowired
	private ReviewService rservice;
	@Autowired
	private CarkindService cservice;
	
	@RequestMapping(value="admin/index.do",method=RequestMethod.GET)
	public String index() {
		return "admin/index";
	}
	
	@RequestMapping(value="admin/register.do",method=RequestMethod.GET)
	public String register() {
		return "admin/register";
	}
	
	@RequestMapping(value="admin/navbar.do",method=RequestMethod.GET)
	public String navbar() {
		return "admin/navbar";
	}
	
	@RequestMapping(value="admin/login.do",method=RequestMethod.GET)
	public String login() {
		return "admin/login";
	}
	@RequestMapping(value="admin/forgot-password.do",method=RequestMethod.GET)
	public String forgotpassword() {
		return "admin/forgot-password";
	}
	@RequestMapping(value="admin/charts.do",method=RequestMethod.GET)
	public String charts() {
		return "admin/charts";
	}
	@RequestMapping(value="admin/cards.do",method=RequestMethod.GET)
	public String cards() {
		return "admin/cards";
	}
	@RequestMapping(value="admin/blank.do",method=RequestMethod.GET)
	public String blank() {
		return "admin/blank";
	}
	@RequestMapping(value="admin/list.do",method=RequestMethod.GET)
	public ModelAndView list() {
		List<ReviewContent> list_ = rservice.listServiceAll();
		String view = "admin/list";
		System.out.println("list_ : " + list_);
		ModelAndView mv = new ModelAndView(view, "list_", list_);
		return mv;
	}
	@RequestMapping(value="admin/member.do",method=RequestMethod.GET)
	public String member() {
		return "admin/member";
	}
	@RequestMapping(value="admin/payment.do",method=RequestMethod.GET)
	public String payment() {
		return "admin/payment";
	}

	@RequestMapping(value="admin/admin.do",method=RequestMethod.GET)
	public String admin() {
		return "admin/admin";
	}
	
	@RequestMapping(value="admin/rdel.do")
	public String rDelete(@RequestParam("rent_review_no")String rent_review_no) {
		rservice.deleteService(rent_review_no);
		return "redirect:list.do";
	}
	@RequestMapping(value="admin/reviewContent.do")
	public ModelAndView reviewContent(@RequestParam("rent_review_no")String rent_review_no) {
		List<ReviewContent> reviewContentList = rservice.reviewContentService(rent_review_no);
		String view = "admin/reviewContent";
		ModelAndView mv = new ModelAndView(view, "reviewContentList", reviewContentList);
		return mv;
	}
	@RequestMapping(value="admin/carDetailWrite.do")
	public ModelAndView carDetailListInsert() {
		List<Carkind> carDetailWrite = cservice.listIService();
		List<Carkind> insuranceSelectBox = cservice.insuranceSelectService();
		String view = "admin/carkindDetailInsert";
		ModelAndView mv = new ModelAndView(view, "carDetailWrite", carDetailWrite);
		mv.addObject("insuranceSelectBox",insuranceSelectBox);
		return mv;
	}
	@RequestMapping(value="admin/carDetailUpdate.do")
	public ModelAndView carDetailListUpdate(@RequestParam("car_kind_no")String car_kind_no) {
		System.out.println("car_kind_no : " + car_kind_no);
		List<Carkind> carDetailUpdate = cservice.ContentService(car_kind_no);
		List<Carkind> carDetailSelectBox = cservice.NotContentService(car_kind_no);
		String view = "admin/carkindDetailUpdate";
		ModelAndView mv = new ModelAndView(view, "carDetailUpdate", carDetailUpdate);
		mv.addObject("carDetailSelectBox", carDetailSelectBox);
		return mv;
	}
	@RequestMapping(value="admin/carDetailUpdateOk.do",method=RequestMethod.POST)
	public String carDetailListUpdateOk(@ModelAttribute("carkind") Carkind carkind) {
		cservice.UpdateService(carkind);
		return "redirect:carDetail.do";
	}
	@RequestMapping(value="admin/carDetailContent.do")
	public ModelAndView carDetailListContent(@RequestParam("car_kind_no")String car_kind_no) {
		System.out.println("car_kind_no : " + car_kind_no);
		List<Carkind> carDetailContent = cservice.ContentService(car_kind_no);
		String view = "admin/carkindDetailContent";
		ModelAndView mv = new ModelAndView(view, "carDetailContent", carDetailContent);
		return mv;
	}
	@RequestMapping(value="admin/carDetailDel.do")
	public String carDetailListdelete(@RequestParam("car_kind_no")String car_kind_no) {
		System.out.println("car_kind_no : " + car_kind_no);
		cservice.deleteService(car_kind_no);
		return "redirect:carDetail.do";
	}
	@RequestMapping(value="admin/carDetailWriteOk.do",method=RequestMethod.POST)
	public String carDetailListInsertOk(
		@RequestParam("branch_no")int branch_no,
		@RequestParam("insurance_no")int insurance_no,
		@RequestParam("car_no")String car_no,
		@RequestParam("car_kind_price_week")int car_kind_price_week,
		@RequestParam("car_kind_price_weekend")int car_kind_price_weekend,
		@RequestParam("car_kind_price_1")int car_kind_price_1,
		@RequestParam("car_kind_price_2")int car_kind_price_2,
		@RequestParam(value="car_kind_navi",required=false)String car_kind_navi,
		@RequestParam(value="car_kind_sensor",required=false)String car_kind_sensor,
		@RequestParam(value="car_kind_blackbox",required=false)String car_kind_blackbox,
		@RequestParam(value="car_kind_bluetooth",required=false)String car_kind_bluetooth,
		@RequestParam(value="car_kind_sunroof",required=false)String car_kind_sunroof,
		@RequestParam(value="car_kind_camera",required=false)String car_kind_camera,
		@RequestParam(value="car_kind_nonsmoke",required=false)String car_kind_nonsmoke) {
		System.out.println("branch_no : " + branch_no);
		Carkind carDetail = new Carkind(null, branch_no, insurance_no, car_no, 
				0, car_kind_price_week, car_kind_price_weekend, car_kind_price_1,
				car_kind_price_2, car_kind_navi, car_kind_sensor, car_kind_blackbox,
				car_kind_bluetooth, car_kind_sunroof, car_kind_camera, car_kind_nonsmoke, null);
		cservice.insertService(carDetail);
		return "redirect:carDetail.do";
	}
	@RequestMapping(value="admin/carDetail.do")
	public ModelAndView carDetailList() {
		List<Carkind> carDetailList = cservice.listService();
		String view = "admin/carkindDetailList";
		ModelAndView mv = new ModelAndView(view, "carDetailList", carDetailList);
		return mv;
	}
}
