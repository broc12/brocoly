package com.khd.rentcarController;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.khd.rentcarDAO.RentcarService;

@Controller
public class RentcarController {
	
	@Autowired
	RentcarService rentcarservice;
	
	@RequestMapping(value="car.do",method=RequestMethod.GET)
	public String car(HttpSession session) {
		List list = rentcarservice.searchService();
		System.out.println(list.size());
		session.setAttribute("list", list);
		return "rentcar/car";
	}
	
	@RequestMapping(value="car.do",method=RequestMethod.POST)
	public String car(@RequestParam("Checkouttime")String checkouttime,@RequestParam("Checkoutdate")String checkoutdate,@RequestParam("Checkintime")String checkintime,@RequestParam("Checkindate")String checkindate,@RequestParam("car_kind_name")String car_kind_name) {

		return "rentcar/car";
	}
	
	@RequestMapping(value="rentcar.do",method=RequestMethod.GET)
	public String rentcar() {
		return "rentcar/rentcar";

	}
}
