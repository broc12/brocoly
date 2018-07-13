package com.khd.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.khd.ReviewController.ReviewContent;
import com.khd.ReviewController.ReviewService;
import com.khd.notice.Notice;
import com.khd.notice.NoticeService;

@Controller
public class AdminController {
	
	@Autowired
	private NoticeService service;
	@Autowired
	private ReviewService rservice;
	
	@RequestMapping(value="admin/index.do",method=RequestMethod.GET)
	public String index() {
		return "admin/index";
	}
	
	@RequestMapping(value="admin/tables.do",method=RequestMethod.GET)
	public String tables() {
		return "admin/tables";
	}
	
	@RequestMapping(value="admin/register.do",method=RequestMethod.GET)
	public String register() {
		return "admin/register";
	}
	
	@RequestMapping(value="admin/navbar.do",method=RequestMethod.GET)
	public String navbar() {
		return "admin/navbar";
	}
	
	@RequestMapping(value="admin/login.do",method=RequestMethod.GET)
	public String login() {
		return "admin/login";
	}
	@RequestMapping(value="admin/forgot-password.do",method=RequestMethod.GET)
	public String forgotpassword() {
		return "admin/forgot-password";
	}
	@RequestMapping(value="admin/charts.do",method=RequestMethod.GET)
	public String charts() {
		return "admin/charts";
	}
	@RequestMapping(value="admin/cards.do",method=RequestMethod.GET)
	public String cards() {
		return "admin/cards";
	}
	@RequestMapping(value="admin/blank.do",method=RequestMethod.GET)
	public String blank() {
		return "admin/blank";
	}
	@RequestMapping(value="admin/list.do",method=RequestMethod.GET)
	public ModelAndView list() {
		List<ReviewContent> list_ = rservice.listServiceAll();
		String view = "admin/list";
		System.out.println("list_ : " + list_);
		ModelAndView mv = new ModelAndView(view, "list_", list_);
		return mv;
	}
	@RequestMapping(value="admin/member.do",method=RequestMethod.GET)
	public String member() {
		return "admin/member";
	}

	@RequestMapping(value="admin/admin.do",method=RequestMethod.GET)
	public String admin() {
		return "admin/admin";
	}
	@RequestMapping(value="admin/service.do",method=RequestMethod.GET)
	public ModelAndView service() {
		List<Notice>totallist = service.totallistService();
		String view = "admin/service";
		ModelAndView mv = new ModelAndView(view,"totallist",totallist);
		return mv;	
	}
	@RequestMapping(value="admin/answer.do",method=RequestMethod.GET)
	public String answer() {
		return "admin/answer";
	}
	@RequestMapping(value="admin/notice.do",method=RequestMethod.GET)
	public String notice() {
		return "admin/notice";
	}
	@RequestMapping("admin/noticeModify.do")
	public ModelAndView noticeModify(@RequestParam("announ_no")String announ_no) {
		List<Notice>update = service.updateService(announ_no);
		String view = "admin/noticeModify";
		ModelAndView mv = new ModelAndView(view,"update",update);
		return mv;
	}
	
	@RequestMapping(value="admin/modify.do",method=RequestMethod.POST)
	public String modify(Notice notice) {
		service.modifyService(notice);
		return "redirect:service.do";
	}
	
	@RequestMapping("admin/del.do")
	public String delete(@RequestParam("announ_no")String announ_no) {
		service.deleteService(announ_no);
		return "redirect:service.do";
	}
	
	@RequestMapping(value="admin/write.do",method=RequestMethod.POST)
	public String insert(@RequestParam("announ_title")String announ_title,@RequestParam("announ_content")String announ_content,
			@RequestParam(value="announ_top",required=false)String announ_top) {
		Notice notice = new Notice(null,announ_title,announ_content,null,1,null,announ_top);
		service.insertService(notice);
		return "redirect:service.do";
	}

	@RequestMapping(value="admin/rdel.do")
	public String rDelete(@RequestParam("rent_review_no")String rent_review_no) {
		rservice.deleteService(rent_review_no);
		return "redirect:list.do";
	}
}
