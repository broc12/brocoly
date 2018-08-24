package com.khd.jejulantis.admin.admin.Controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.khd.jejulantis.admin.chart.Service.ChartService;
import com.khd.jejulantis.admin.manager.Service.ManagerService;
import com.khd.jejulantis.client.member.Service.MemberService;
import com.khd.jejulantis.model.Manager;
import com.khd.jejulantis.model.Member;

@Controller
public class AdminController {
	@Autowired
	private ChartService chartservice;
	@Autowired
	private MemberService memberservice;
	@Autowired
	ManagerService managerService;
	@RequestMapping(value="admin/index.do",method=RequestMethod.GET)
	public ModelAndView index (HttpSession session)throws IOException {
		List<Member>list = memberservice.newListService();
		ObjectMapper obj = new ObjectMapper();
		HashMap map = chartservice.chartService();
		String es = obj.writeValueAsString(map);
		String view = "admin/index";
		ModelAndView mv = new ModelAndView(view,"map",es);
		User userDetail = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if( userDetail== null) {
			System.out.println("널이지롱");
		}
		Manager manager = new Manager(userDetail.getUsername());
		
		 Manager kk = managerService.securityloginCheck(manager);
		 session.setAttribute("managerlog", kk);
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

	/*@RequestMapping(value="admin/carDetail.do")
	public String carDetailList() {
		return "admin/carkindDetailList";
	}*/
}
