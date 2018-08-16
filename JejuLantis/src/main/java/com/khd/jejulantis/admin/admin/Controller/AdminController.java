package com.khd.jejulantis.admin.admin.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {
	
	@RequestMapping(value="admin/index.do",method=RequestMethod.GET)
	public String index() {
		return "admin/index";
	}
	
	@RequestMapping(value="admin/navbar.do",method=RequestMethod.GET)
	public String navbar() {
		return "admin/navbar";
	}
	
	@RequestMapping(value="admin/forgot-password.do",method=RequestMethod.GET)
	public String forgotpassword() {
		return "admin/adminUsers/forgot-password";
	}
	@RequestMapping(value="admin/charts.do",method=RequestMethod.GET)
	public String charts() {
		return "admin/charts/charts";
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
	@RequestMapping(value="admin/payment.do",method=RequestMethod.GET)
	public String payment() {
		return "admin/payments/payment";
	}
//	@RequestMapping(value="admin/admin.do",method=RequestMethod.GET)
//	public String admin() {
//		return "admin/admins/admin";
//	}
	/*@RequestMapping(value="admin/carDetail.do")
	public String carDetailList() {
		return "admin/carkindDetailList";
	}*/
}
