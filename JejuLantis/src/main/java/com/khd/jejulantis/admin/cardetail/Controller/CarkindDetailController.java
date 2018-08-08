package com.khd.jejulantis.admin.cardetail.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.khd.jejulantis.admin.cardetail.Service.CarkindDetailService;
import com.khd.jejulantis.model.CarkindDetail;
import com.khd.jejulantis.model.Insurance;

@Controller
public class CarkindDetailController {

	@Autowired
	private CarkindDetailService cservice;

	@RequestMapping(value="admin/carDetailWrite.do")
	public ModelAndView carDetailListInsert(@RequestParam("manager_id")String manager_id) {
		List<CarkindDetail> carDetailWrite = cservice.listIService();
		List<CarkindDetail> branchNoSelect = cservice.branchNoSelect(manager_id);
		List<CarkindDetail> kingbranchNotSelect = cservice.kingbranchNotSelectService(manager_id);
		String view = "admin/cartypeDetails/carkindDetailInsert";
		ModelAndView mv = new ModelAndView(view, "carDetailWrite", carDetailWrite);
		mv.addObject("branchNoSelect", branchNoSelect);
		mv.addObject("kingbranchNotSelect",kingbranchNotSelect);
		return mv;
	}
	@RequestMapping(value="admin/carDetailUpdate.do")
	public ModelAndView carDetailListUpdate(
			@RequestParam("manager_id")String manager_id,
			@RequestParam("car_kind_no")int car_kind_no) {
		System.out.println("car_kind_no : " + car_kind_no);
		List<CarkindDetail> carDetailUpdate = cservice.ContentService(car_kind_no);
		List<CarkindDetail> carDetailSelectBox = cservice.NotContentService(car_kind_no);
		List<CarkindDetail> branchNoSelect = cservice.branchNoSelect(manager_id);
		List<CarkindDetail> kingbranchNotSelect = cservice.kingbranchNotSelectService(manager_id);
		String view = "admin/cartypeDetails/carkindDetailUpdate";
		ModelAndView mv = new ModelAndView(view, "carDetailUpdate", carDetailUpdate);
		mv.addObject("carDetailSelectBox", carDetailSelectBox);
		mv.addObject("branchNoSelect", branchNoSelect);
		mv.addObject("kingbranchNotSelect",kingbranchNotSelect);
		return mv;
	}
	@RequestMapping(value="admin/carDetailUpdateOk.do",method=RequestMethod.POST)
	public String carDetailListUpdateOk(
			@RequestParam("manager_id")String manager_id,
			@ModelAttribute("carkind") CarkindDetail carkind) {
		cservice.UpdateService(carkind);
		return "redirect:carDetail.do?manager_id="+manager_id;
	}
	@RequestMapping(value="admin/carDetailContent.do")
	public ModelAndView carDetailListContent(@RequestParam("car_kind_no")int car_kind_no) {
		System.out.println("car_kind_no : " + car_kind_no);
		List<CarkindDetail> carDetailContent = cservice.ContentService(car_kind_no);
		String view = "admin/cartypeDetails/carkindDetailContent";
		ModelAndView mv = new ModelAndView(view, "carDetailContent", carDetailContent);
		return mv;
	}
	@RequestMapping(value="admin/carDetailDel.do")
	public String carDetailListdelete(@RequestParam("manager_id")String manager_id,
			@RequestParam("car_kind_no")int car_kind_no) {
		System.out.println("car_kind_no : " + car_kind_no);
		cservice.deleteService(car_kind_no);
		return "redirect:carDetail.do?manager_id="+manager_id;
	}
	@RequestMapping(value="admin/carDetailWriteOk.do",method=RequestMethod.POST)
	public String carDetailListInsertOk(
		@RequestParam("manager_id")String manager_id,
		@RequestParam("branch_no")int branch_no,
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
		System.out.println("car_no : " + car_no);
		System.out.println("car_kind_price_week : " + car_kind_price_week);
		System.out.println("car_kind_price_weekend : " + car_kind_price_weekend);
		System.out.println("car_kind_price_holiday : " + car_kind_price_holiday);
		System.out.println("car_kind_price_h_holiday : " + car_kind_price_h_holiday);
		System.out.println("car_kind_navi : " + car_kind_navi);
		System.out.println("car_kind_sensor : " + car_kind_sensor);
		System.out.println("car_kind_blackbox : " + car_kind_blackbox);
		System.out.println("car_kind_bluetooth : " + car_kind_bluetooth);
		System.out.println("car_kind_sunroof : " + car_kind_sunroof);
		System.out.println("car_kind_camera : " + car_kind_camera);
		System.out.println("car_kind_nonsmoke : " + car_kind_nonsmoke);
		CarkindDetail carDetail = new CarkindDetail(0, branch_no, car_no, 
			car_kind_price_week, car_kind_price_weekend, car_kind_price_holiday, car_kind_price_h_holiday, 
			 0, car_kind_navi, car_kind_sensor, car_kind_blackbox,car_kind_bluetooth, car_kind_sunroof, 
			car_kind_camera, car_kind_nonsmoke, 0, 0, "N", null);
		System.out.println("test1");
		cservice.insertService(carDetail);
		System.out.println("test2");
		return "redirect:carDetail.do?manager_id="+manager_id;
	}
	@RequestMapping(value="admin/carDetail.do")
	public ModelAndView carDetailList(@RequestParam("manager_id")String manager_id) {
		List<CarkindDetail> identyBNo= cservice.identyBNoService(manager_id);
		List<CarkindDetail> selectOne;
		if(identyBNo.get(0).getBranch_no()==1) {
			selectOne =  cservice.listAllService();
		}else {
			selectOne =  cservice.listService(manager_id);
		}
		System.out.println("manager_id : " + manager_id);
		String view = "admin/cartypeDetails/carkindDetailList";
		ModelAndView mv = new ModelAndView(view, "carDetailList", selectOne);
		return mv;
	}
}
