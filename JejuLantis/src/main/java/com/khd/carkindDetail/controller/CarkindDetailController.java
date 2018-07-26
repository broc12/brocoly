package com.khd.carkindDetail.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.khd.carkindDetail.CarkindDetail;
import com.khd.carkindDetail.CarkindDetailService;

@Controller
public class CarkindDetailController {

	@Autowired
	private CarkindDetailService cservice;

	@RequestMapping(value="admin/carDetailWrite.do")
	public ModelAndView carDetailListInsert(@RequestParam("manager_id")String manager_id) {
		List<CarkindDetail> carDetailWrite = cservice.listIService();
		List<CarkindDetail> insuranceSelectBox = cservice.insuranceSelectService(manager_id);
		List<CarkindDetail> branchNoSelect = cservice.branchNoSelect(manager_id);
		String view = "admin/carkindDetailInsert";
		ModelAndView mv = new ModelAndView(view, "carDetailWrite", carDetailWrite);
		mv.addObject("insuranceSelectBox",insuranceSelectBox);
		mv.addObject("branchNoSelect", branchNoSelect);
		return mv;
	}
	@RequestMapping(value="admin/carDetailUpdate.do")
	public ModelAndView carDetailListUpdate(@RequestParam("car_kind_no")int car_kind_no) {
		System.out.println("car_kind_no : " + car_kind_no);
		List<CarkindDetail> carDetailUpdate = cservice.ContentService(car_kind_no);
		List<CarkindDetail> carDetailSelectBox = cservice.NotContentService(car_kind_no);
		String view = "admin/carkindDetailUpdate";
		ModelAndView mv = new ModelAndView(view, "carDetailUpdate", carDetailUpdate);
		mv.addObject("carDetailSelectBox", carDetailSelectBox);
		return mv;
	}
	@RequestMapping(value="admin/carDetailUpdateOk.do",method=RequestMethod.POST)
	public String carDetailListUpdateOk(@ModelAttribute("carkind") CarkindDetail carkind) {
		cservice.UpdateService(carkind);
		return "redirect:carDetail.do";
	}
	@RequestMapping(value="admin/carDetailContent.do")
	public ModelAndView carDetailListContent(@RequestParam("car_kind_no")int car_kind_no) {
		System.out.println("car_kind_no : " + car_kind_no);
		List<CarkindDetail> carDetailContent = cservice.ContentService(car_kind_no);
		String view = "admin/carkindDetailContent";
		ModelAndView mv = new ModelAndView(view, "carDetailContent", carDetailContent);
		return mv;
	}
	@RequestMapping(value="admin/carDetailDel.do")
	public String carDetailListdelete(@RequestParam("car_kind_no")int car_kind_no) {
		System.out.println("car_kind_no : " + car_kind_no);
		cservice.deleteService(car_kind_no);
		return "redirect:carDetail.do";
	}
	@RequestMapping(value="admin/carDetailWriteOk.do",method=RequestMethod.POST)
	public String carDetailListInsertOk(
		@RequestParam("branch_no")int branch_no,
		@RequestParam("insurance_no")int insurance_no,
		@RequestParam("car_no")int car_no,
		@RequestParam("car_kind_price_week")int car_kind_price_week,
		@RequestParam("car_kind_price_weekend")int car_kind_price_weekend,
		@RequestParam("car_kind_price_holiday")int car_kind_price_holiday,
		@RequestParam("car_kind_price_h_holiday")int car_kind_price_h_holiday,
		@RequestParam(value="car_kind_navi",required=false)String car_kind_navi,
		@RequestParam(value="car_kind_sensor",required=false)String car_kind_sensor,
		@RequestParam(value="car_kind_blackbox",required=false)String car_kind_blackbox,
		@RequestParam(value="car_kind_bluetooth",required=false)String car_kind_bluetooth,
		@RequestParam(value="car_kind_sunroof",required=false)String car_kind_sunroof,
		@RequestParam(value="car_kind_camera",required=false)String car_kind_camera,
		@RequestParam(value="car_kind_nonsmoke",required=false)String car_kind_nonsmoke) {
		System.out.println("branch_no : " + branch_no);
		System.out.println("insurance_no : " + insurance_no);
		CarkindDetail carDetail = new CarkindDetail(null, branch_no, insurance_no, car_no, 
				0, car_kind_price_week, car_kind_price_weekend, car_kind_price_holiday, car_kind_price_h_holiday, car_kind_navi, car_kind_sensor, car_kind_blackbox,
				car_kind_bluetooth, car_kind_sunroof, car_kind_camera, car_kind_nonsmoke, 0, 'N', null);
		cservice.insertService(carDetail);
		return "redirect:carDetail.do";
	}
	@RequestMapping(value="admin/carDetail.do")
	public ModelAndView carDetailList(@RequestParam("manager_id")String manager_id) {
		List<CarkindDetail> carDetailList = cservice.listService(manager_id);
		System.out.println("manager_id : " + manager_id);
		String view = "admin/carkindDetailList";
		ModelAndView mv = new ModelAndView(view, "carDetailList", carDetailList);
		return mv;
	}
}
