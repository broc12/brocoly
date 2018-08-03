package com.khd.jejulantis.client.rentcar.Controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.khd.jejulantis.client.rentcar.Service.RentcarService;
import com.khd.jejulantis.model.Rcar;
import com.khd.jejulantis.model.SearchRequirements;

@Controller
public class RentcarController {
	
	@Autowired
	RentcarService rentcarservice;
	
	@RequestMapping(value="car.do",method=RequestMethod.GET)
	public ModelAndView car(HttpServletRequest request,@RequestParam(value="sort",required=false) String sort) {
		ModelAndView mv = new ModelAndView("rentcar/rentcars/car");
		SearchRequirements requirements = new SearchRequirements(rentcarservice.timeStampService(),sort);
		List<Rcar> list = rentcarservice.rentcarListService(requirements);
		mv.addObject("list", list);
		mv.addObject("requirements", requirements);
		return mv;
	}
	
	@RequestMapping(value="car.do",method=RequestMethod.POST)
	public String car(HttpServletRequest request,@RequestParam("Checkouttime")String checkouttime,@RequestParam("Checkoutdate")String checkoutdate,@RequestParam("Checkintime")String checkintime,@RequestParam("Checkindate")String checkindate,@RequestParam("car_name")String car_name) {
		SearchRequirements requirements = new SearchRequirements(checkindate,checkintime,checkoutdate,checkouttime,car_name);
		requirements.checkTime(rentcarservice.currenttimeStampService());
		if(!requirements.isErrorFlag()) {
			List<Rcar> list = rentcarservice.rentcarListService(requirements);
			request.setAttribute("list", list);
		}
		request.setAttribute("requirements", requirements);
		return "rentcar/rentcars/car";
	}
	
	@RequestMapping(value="rentcar.do",method=RequestMethod.GET)
	public String rentcar() {
		return "redirect:/car.do";
	}
	
	@RequestMapping(value="rentcar.do",method=RequestMethod.POST)
	public ModelAndView rentcar(SearchRequirements requirements) {
		ModelAndView mv = new ModelAndView("rentcar/rentcars/rentcar");
		List<Rcar> list = rentcarservice.confirmrentcarService(requirements);
		if(list == null) {
			requirements.setErrorMsg("사용 가능한 차량이 없습니다.");
		}else {
			mv.addObject("list", list);
		}
		requirements.setSearchFlag(true);
		mv.addObject("requirements", requirements);
		return mv;
	}
	@RequestMapping(value="searchcar.do",method=RequestMethod.GET)
	public @ResponseBody List<Rcar> searchcar(@RequestParam(value="checkListmanu[]",required=false) List<String> checkListmanu,@RequestParam(value="checkListfuel[]",required=false) List<String> checkListfuel,@RequestParam(value="checkListtype[]",required=false) List<String> checkListtype,@RequestParam(value="checkListoption[]",required=false) List<String> checkListoption,@RequestParam(value="checkindate",required=false) String checkindate,@RequestParam(value="checkoutdate",required=false) String checkoutdate,@RequestParam(value="car_name",required=false) String car_name) {
		SearchRequirements requirements = new SearchRequirements(checkindate,checkoutdate,car_name,checkListmanu,checkListfuel,checkListtype,checkListoption);
		List<Rcar> list = rentcarservice.rentcarListService(requirements);
		/*if(list!=null)System.out.println(list.size());*/
		return list;
	}
	@RequestMapping(value="currenttime.do",method=RequestMethod.GET)
	public @ResponseBody Date currenttime() {
		Date currentDate = rentcarservice.currenttimeStampService();
		return currentDate;
	}
}
