package com.khd.jejulantis.client.home.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.khd.jejulantis.client.best.Service.BestService;
import com.khd.jejulantis.model.Car;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private BestService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		List<Car>bestlist = service.bestlistService();
		String view = "rentcar/home";
		ModelAndView mv = new ModelAndView(view,"best",bestlist);
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

}