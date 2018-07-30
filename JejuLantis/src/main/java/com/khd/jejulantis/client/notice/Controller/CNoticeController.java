package com.khd.jejulantis.client.notice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.khd.jejulantis.client.notice.Service.CNoticeService;
import com.khd.jejulantis.model.Notice;

@Controller
public class CNoticeController {
	
	@Autowired
	private CNoticeService service;
	
	@RequestMapping(value="service.do",method=RequestMethod.GET)
	public ModelAndView service() {
		List<Notice>list = service.listService();
		List<Notice>toplist = service.toplistService();
		String view = "rentcar/helps/service";
		ModelAndView mv = new ModelAndView(view,"list",list);
		mv.addObject("toplist", toplist);
		return mv;
	}
	
	@RequestMapping(value="serviceContent.do")
	public ModelAndView serviceContent(@RequestParam("announce_no")long announce_no) {
		List<Notice>subject = service.subjectService(announce_no);
		String view = "rentcar/helps/serviceContent";
		ModelAndView mv = new ModelAndView(view,"subject",subject);
		return mv;
	}
}
