package com.khd.jejulantis.admin.notice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.khd.jejulantis.admin.notice.Service.NoticeService;
import com.khd.jejulantis.model.Notice;

@Controller
public class NoticeController {
	
	@Autowired
	private NoticeService service;
		
	@RequestMapping("admin/noticeModify.do")
	public ModelAndView noticeModify(@RequestParam("announce_no")long announce_no) {
		List<Notice>update = service.updateService(announce_no);
		String view = "admin/notices/noticeModify";
		ModelAndView mv = new ModelAndView(view,"update",update);
		return mv;
	}
	
	@RequestMapping(value="admin/modify.do",method=RequestMethod.POST)
	public String modify(Notice notice) {
		service.modifyService(notice);
		return "redirect:service.do";
	}
	
	@RequestMapping("admin/noticedel.do")
	public String delete(@RequestParam("announce_no")long announce_no) {
		service.deleteService(announce_no);
		return "redirect:service.do";
	}
	
	@RequestMapping(value="admin/write.do",method=RequestMethod.POST)
	public String insert(Notice notice) {
		service.insertService(notice);
		return "redirect:service.do";
	}
	@RequestMapping(value="admin/service.do",method=RequestMethod.GET)
	public ModelAndView service2() {
		List<Notice>totallist = service.totallistService();
		String view = "admin/notices/service";
		ModelAndView mv = new ModelAndView(view,"totallist",totallist);
		return mv;	
	}
	
	@RequestMapping(value="admin/notice.do",method=RequestMethod.GET)
	public String notice() {
		return "admin/notices/notice";
	}
}
