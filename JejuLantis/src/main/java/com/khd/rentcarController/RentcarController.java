package com.khd.rentcarController;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.Minutes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.khd.model.Rcar;
import com.khd.model.SearchRequirements;
import com.khd.rentcarDAO.RentcarService;

@Controller
public class RentcarController {
	
	@Autowired
	RentcarService rentcarservice;
	
	@RequestMapping(value="car.do",method=RequestMethod.GET)
	public String car(HttpServletRequest request,@RequestParam(value="sort",required=false) String sort) {		
		SearchRequirements requirements = new SearchRequirements(rentcarservice.timeStampService());
		List<Rcar> list = rentcarservice.rentcarListService(requirements);
		request.setAttribute("list", list);
		request.setAttribute("requirements", requirements);
		return "rentcar/car";
	}
	
	@RequestMapping(value="car.do",method=RequestMethod.POST)
	public String car(HttpServletRequest request,@RequestParam("Checkouttime")String checkouttime,@RequestParam("Checkoutdate")String checkoutdate,@RequestParam("Checkintime")String checkintime,@RequestParam("Checkindate")String checkindate,@RequestParam("car_name")String car_name) {
		SearchRequirements requirements = new SearchRequirements(checkindate,checkintime,checkoutdate,checkouttime,car_name);
		String result = checkTime(requirements);
		System.out.println(result);
		if(result == null) {
		List<Rcar> list = rentcarservice.rentcarListService(requirements);
		request.setAttribute("list", list);
		request.setAttribute("requirements", requirements);
		return "rentcar/car";
		}else {
			return "";
		}
	}
	
	@RequestMapping(value="rentcar.do",method=RequestMethod.GET)
	public String rentcar() {
		return "rentcar/rentcar";
	}
	@RequestMapping(value="searchcar.do",method=RequestMethod.GET)
	public @ResponseBody List<Rcar> searchcar(@RequestParam(value="checkListmanu[]",required=false) List<String> checkListmanu,@RequestParam(value="checkListfuel[]",required=false) List<String> checkListfuel,@RequestParam(value="checkListtype[]",required=false) List<String> checkListtype,@RequestParam(value="checkListoption[]",required=false) List<String> checkListoption,@RequestParam(value="checkindate",required=false) String checkindate,@RequestParam(value="checkoutdate",required=false) String checkoutdate,@RequestParam(value="car_name",required=false) String car_name) {
		SearchRequirements requirements = new SearchRequirements(checkindate,checkoutdate,car_name,checkListmanu,checkListfuel,checkListtype,checkListoption);
		List<Rcar> list = rentcarservice.rentcarListService(requirements);
		if(list!=null)System.out.println(list.size());
		return list;
	}
	@RequestMapping(value="currenttime.do",method=RequestMethod.GET)
	public @ResponseBody Date currenttime() {
		Date currentDate = rentcarservice.currenttimeStampService();
		return currentDate;
	}
	
	String checkTime(SearchRequirements requirements) {
		String result = null;
		DateTime today = new DateTime(rentcarservice.currenttimeStampService());
		if(Minutes.minutesBetween(today, requirements.getRent_reserve_start()).getMinutes()<0) {
			result = "예약 가능 시간 지남";
		}else if(today.getDayOfMonth()==requirements.getRent_reserve_start().getDayOfMonth()){
			if(requirements.getRent_reserve_start().getHourOfDay()<14) {
				result = "당일 예약 시간 지남";
			}
		}else if(Minutes.minutesBetween(requirements.getRent_reserve_start(), requirements.getRent_reserve_end()).getMinutes()<0) {
			result = "예약 기간 오류";
		}else if(Hours.hoursBetween(requirements.getRent_reserve_start(), requirements.getRent_reserve_end()).getHours()<24) {
			result = "예약 최소 시간 오류";
		}else if(Hours.hoursBetween(requirements.getRent_reserve_start(), requirements.getRent_reserve_end()).getHours()>180) {
			result = "예약 최대 시간 오류";
		}
		return result;
	}
}
