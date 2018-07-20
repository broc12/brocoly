package com.khd.jejulantis;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.khd.ReviewController.BranchName;
import com.khd.ReviewController.ReviewService;
import com.khd.notice.Notice;
import com.khd.notice.NoticeService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private NoticeService service;
	@Autowired
	private ReviewService reviewService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
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
	// 아이디 찾기 폼
	@RequestMapping(value = "find_id_form.do",method=RequestMethod.GET)
	public String find_id_form() {
		return "rentcar/find_id_form";
	}
	// 비밀번호찾기 폼
		@RequestMapping(value = "find_pwd_form.do",method=RequestMethod.GET)
		public String find_pwd_form() {
			return "rentcar/find_pwd_form";
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
	@RequestMapping(value="board.do")
	public ModelAndView list(@RequestParam(value ="searchValue", required= false)String searchValue){
		List<BranchName> branch = null;
		if(searchValue == null) {
			branch = reviewService.listService();
		}else if(searchValue != null){
			branch = reviewService.selectService(searchValue);
		}
		String view = "rentcar/board";
		ModelAndView mv = new ModelAndView(view, "branch", branch);
		return mv;
	}
	@RequestMapping(value="service.do",method=RequestMethod.GET)
	public ModelAndView service() {
		List<Notice>list = service.listService();
		List<Notice>toplist = service.toplistService();
		String view = "rentcar/service";
		ModelAndView mv = new ModelAndView(view,"list",list);
		mv.addObject("toplist", toplist);
		return mv;
	}/*
	@RequestMapping(value="mypage.do",method=RequestMethod.GET)
	public String mypage() {
		return "rentcar/mypage";
	}*/
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
	@RequestMapping(value="faq.do",method=RequestMethod.GET)
	public String faq() {
		return "rentcar/faq";
	}/*
	@RequestMapping(value="help.do",method=RequestMethod.GET)
	public String help() {
		return "rentcar/help";
	}*/
	@RequestMapping(value="helpadd.do",method=RequestMethod.GET)
	public String helpadd() {
		return "rentcar/helpadd";
	}/*
	@RequestMapping(value="helpContent.do",method=RequestMethod.GET)
	public String helpContent() {
		return "rentcar/helpContent";
	}*/
	@RequestMapping(value="serviceContent.do")
	public ModelAndView serviceContent(@RequestParam("announ_no")String announ_no) {
		List<Notice>subject = service.subjectService(announ_no);
		String view = "rentcar/serviceContent";
		ModelAndView mv = new ModelAndView(view,"subject",subject);
		return mv;
	}
}