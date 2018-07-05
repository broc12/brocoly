package com.khd.rentcarController;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RentcarController {
	
	@RequestMapping(value="car.do",method=RequestMethod.GET)
	public String car(HttpSession session) {
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("cartype","스팅어");
		map.put("menufactur","기아");
		map.put("perwage","26400");
		map.put("passenger","5");
		map.put("fuel","휘발유");
		map.put("trans","오토");
		map.put("best","특별한렌트카");
		map.put("option1","옵션1");
		map.put("option2","옵션2");
		map.put("option3","옵션3");
		map.put("option4","옵션4");
		map.put("option5","옵션5");
		map.put("branch","특별한렌트카");
		map.put("rating","4.1");
		map.put("xx","13400");
		map.put("insurance","13000");
		map.put("yy","2000만원");
		map.put("cartype","26400");
		session.setAttribute("car", map);
		return "rentcar/car";
	}
	
	@RequestMapping(value="car.do",method=RequestMethod.POST)
	public String car(@RequestParam("Checkouttime")String checkouttime,@RequestParam("Checkoutdate")String checkoutdate,@RequestParam("Checkintime")String checkintime,@RequestParam("Checkindate")String checkindate,@RequestParam("car_kind_name")String car_kind_name) {
/*		System.out.println(checkindate);
		System.out.println(checkintime);
		System.out.println(checkoutdate);
		System.out.println(checkouttime);
		System.out.println(car_kind_name);*/

		return "rentcar/car";
	}
	
	@RequestMapping(value="rentcar.do",method=RequestMethod.GET)
	public String rentcar() {
		return "rentcar/rentcar";

	}
}
