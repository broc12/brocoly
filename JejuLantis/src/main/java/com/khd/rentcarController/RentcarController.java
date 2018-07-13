package com.khd.rentcarController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.khd.model.Rcar;
import com.khd.rentcarDAO.RentcarService;

@Controller
public class RentcarController {
	
	@Autowired
	RentcarService rentcarservice;
	
	@RequestMapping(value="car.do",method=RequestMethod.GET)
	public String car(HttpSession session) {
		List<Rcar> list = rentcarservice.searchcarService();
		List lista = rentcarservice.searchService();
		System.out.println(lista.size());
		session.setAttribute("list", list);
		return "rentcar/car";
	}
	
	@RequestMapping(value="car.do",method=RequestMethod.POST)
	public String car(@RequestParam("Checkouttime")String checkouttime,@RequestParam("Checkoutdate")String checkoutdate,@RequestParam("Checkintime")String checkintime,@RequestParam("Checkindate")String checkindate,@RequestParam("car_kind_name")String car_kind_name) {

		System.out.println(checkoutdate);
		System.out.println(checkouttime);
		System.out.println(checkoutdate+checkouttime);
		
		System.out.println(checkindate);
		System.out.println(checkintime);
		System.out.println(checkindate+checkintime);
		
		System.out.println(car_kind_name);
		java.sql.Date dd=null;
		java.util.Date d = null;/*
		try {
		d = new SimpleDateFormat("yyyy-MM-dd").parse(totalbirth);
		}catch(ParseException pe) {}
        dd = new java.sql.Date(d.getTime());*/
		return "rentcar/car";
	}
	
	@RequestMapping(value="rentcar.do",method=RequestMethod.GET)
	public String rentcar() {
		return "rentcar/rentcar";
	}
	@RequestMapping(value="searchcar.do",method=RequestMethod.GET)
	public @ResponseBody List searchcar(@RequestParam(value="list_manufactur_val[]") List list_manufactur_val) {
		//List list = rentcarservice.searchService();
		System.out.println(list_manufactur_val.size());
		//System.out.println(listid.size());
		for(int i = 0;i<list_manufactur_val.size();i++) {
			System.out.println(list_manufactur_val.get(i));
		}
		
		return null;
	}
}
