package com.khd.jejulantis.client.home.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.khd.jejulantis.client.best.Service.BestService;
import com.khd.jejulantis.client.member.Service.MemberService;
import com.khd.jejulantis.client.rentcar.Service.RentcarService;
import com.khd.jejulantis.model.Car;
import com.khd.jejulantis.model.Member;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	MemberService memberService;
	@Autowired
	private BestService service;
	@Autowired
	private RentcarService rentcarservice;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {

		DateTime date = new DateTime(rentcarservice.timeStampService());
		List<Car>bestlist = service.bestlistService();
		List<Car>mdlist = service.mdlistService();
		String view = "rentcar/home";
		ModelAndView mv = new ModelAndView(view,"best",bestlist);
		mv.addObject("date",date.toString("yyyy-MM-dd"));
		mv.addObject("md",mdlist);

		return mv;
	}
	
	@RequestMapping(value = "find_id_form.do",method=RequestMethod.GET)
	public String find_id_form() {
		return "rentcar/users/find_id_form";
	}
	@RequestMapping(value = "find_pwd_form.do",method=RequestMethod.GET)
	public String find_pwd_form() {
		return "rentcar/users/find_pwd_form";
	}
	
	@RequestMapping(value="member.do",method=RequestMethod.GET)
	public String member() {
		return "rentcar/users/member";
	}
	@RequestMapping(value="login.do",method=RequestMethod.GET)
	public String login() {
		return "rentcar/users/login";
	}

	@RequestMapping(value="faq.do",method=RequestMethod.GET)
	public String faq() {
		return "rentcar/helps/faq";
	}
	@RequestMapping(value="/successlogin.do",method=RequestMethod.GET)
	public String succes(HttpSession session) {
			System.out.println("ad");
			User userDetail = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			if( userDetail== null) {
				System.out.println("널이지롱");
			}
			Member member = new Member(userDetail.getUsername());
			
			 Member tt = memberService.securityloginCheck(member);
			 session.setAttribute("log", tt);
			
		return "rentcar/home";
	}

}