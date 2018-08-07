package com.khd.jejulantis.admin.qna.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.khd.jejulantis.admin.notice.Service.NoticeService;
import com.khd.jejulantis.admin.review.Service.ReviewService;
import com.khd.jejulantis.client.qna.Service.CustomerCenterService;
import com.khd.jejulantis.model.Notice;
import com.khd.jejulantis.model.Qna;
import com.khd.jejulantis.model.ReviewContent;

@Controller
public class AdminCustomerController {
	@Autowired
	private CustomerCenterService customerService;
	
	
	@RequestMapping(value="admin/tables.do",method=RequestMethod.GET)
	public ModelAndView tables() {
		String view = "admin/consults/qnaList";
		List<Qna> list = customerService.qnaAdminList();
		ModelAndView mv = new ModelAndView(view,"list",list);
		return mv;
	}
	@RequestMapping(value="admin/answer.do",method=RequestMethod.GET)
	public ModelAndView answer(@RequestParam("qna_no") String Strqna_no) {
		long qna_no = 0;
			if(Strqna_no!=null)Strqna_no=Strqna_no.trim();
			if(Strqna_no.length()!=0) qna_no = Integer.parseInt(Strqna_no);
			Qna qna = customerService.qnaContent(qna_no);
			String view = "admin/consults/qnaAnswer";
			ModelAndView mv = new ModelAndView(view,"qna",qna);
		return mv;
	}
	@RequestMapping(value="admin/del.do",method=RequestMethod.GET)
	public ModelAndView del(@RequestParam("qna_no") String Strqna_no) {
		long qna_no = 0;
		if(Strqna_no!=null)Strqna_no=Strqna_no.trim();
		if(Strqna_no.length()!=0) qna_no = Integer.parseInt(Strqna_no);
		boolean flag = customerService.qnaDel(qna_no);
		String view = "admin/consults/AdminDelCheck";
		ModelAndView mv = new ModelAndView(view,"flag",flag);
		return mv;
	}
		@RequestMapping(value="admin/qnaReply.do",method=RequestMethod.POST)
	public ModelAndView qnaReply(@RequestParam("qna_group") String Strqna_group, @RequestParam("contents") String qna_content, 
			@RequestParam("qna_name") String qna_name, @RequestParam("qna_pwd") String qna_pwd,  @RequestParam("manager_no") int manager_no) {
		System.out.println("manager_no " + manager_no);
		long qna_group = 0;
		if(Strqna_group!=null)Strqna_group=Strqna_group.trim();
		if(Strqna_group.length()!=0) qna_group = Long.parseLong(Strqna_group);
			qna_name = "[RE]"+qna_name+"님 답변드립니다.";
			Qna qna = new Qna(qna_group, qna_group, -1, qna_name, "admin", "admin","admin", qna_content, qna_pwd, 0, 0, null , "admin",-1, manager_no,-1);
		customerService.replyUpdate(qna_group);
			boolean flag = customerService.replyInsert(qna);
			String view = "admin/consults/AdminInsertCheck";
		ModelAndView mv = new ModelAndView(view,"flag",flag);
		return mv;
		}
}

