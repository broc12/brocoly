package com.khd.jejulantis;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "rentcar/home";
	}

	@RequestMapping(value="car.do",method=RequestMethod.GET)
	public String car() {
		return "rentcar/car";
	}
	@RequestMapping(value="rentcar.do",method=RequestMethod.GET)
	public String rentcar() {
		return "rentcar/rentcar";
	}
	@RequestMapping(value="member.do",method=RequestMethod.GET)
	public String member() {
		return "rentcar/member";
	}
	@RequestMapping(value="login.do",method=RequestMethod.GET)
	public String login() {
		return "rentcar/login";
	}
	@RequestMapping(value="board.do",method=RequestMethod.GET)
	public String board() {
		return "rentcar/board";
	}
	/*@RequestMapping(value="service.do",method=RequestMethod.GET)
	public String service() {
		return "rentcar/service";
	}*/
	@RequestMapping(value="mypage.do",method=RequestMethod.GET)
	public String mypage() {
		return "rentcar/mypage";
	}
	@RequestMapping(value="input.do",method=RequestMethod.GET)
	public String input() {
		return "rentcar/input";
	}
	@RequestMapping(value="end.do",method=RequestMethod.GET)
	public String end() {
		return "rentcar/end";
	}
	@RequestMapping(value="check.do",method=RequestMethod.GET)
	public String check() {
		return "rentcar/check";
	}
}