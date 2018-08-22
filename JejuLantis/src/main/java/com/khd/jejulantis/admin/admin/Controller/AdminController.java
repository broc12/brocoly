package com.khd.jejulantis.admin.admin.Controller;

import java.io.IOException;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.khd.jejulantis.admin.chart.Service.ChartService;

@Controller
public class AdminController {
	@Autowired
	private ChartService chartservice;
	
	@RequestMapping(value="admin/index.do",method=RequestMethod.GET)
	public ModelAndView index ()throws IOException {
		ObjectMapper obj = new ObjectMapper();
		HashMap map = chartservice.chartService();
		String es = obj.writeValueAsString(map);
		String view = "admin/index";
		ModelAndView mv = new ModelAndView(view,"map",es);
		return mv;
	}
	
	@RequestMapping(value="admin/navbar.do",method=RequestMethod.GET)
	public String navbar() {
		return "admin/navbar";
	}
	
	@RequestMapping(value="admin/forgot-password.do",method=RequestMethod.GET)
	public String forgotpassword() {
		return "admin/adminUsers/forgot-password";
	}
	@RequestMapping(value="admin/cards.do",method=RequestMethod.GET)
	public String cards() {
		return "admin/cards";
	}
	@RequestMapping(value="admin/blank.do",method=RequestMethod.GET)
	public String blank() {
		return "admin/blank";
	}
	/*@RequestMapping(value="admin/list.do",method=RequestMethod.GET)
	public String list() {
		return "admin/list";
	}*/
/*	@RequestMapping(value="admin/member.do",method=RequestMethod.GET)
	public String member() {
		return "admin/members/member";
	}*/
//	@RequestMapping(value="admin/admin.do",method=RequestMethod.GET)
//	public String admin() {
//		return "admin/admins/admin";
//	}
	/*@RequestMapping(value="admin/carDetail.do")
	public String carDetailList() {
		return "admin/carkindDetailList";
	}*/
}
