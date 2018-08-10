package com.khd.jejulantis.admin.MemberManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.khd.jejulantis.client.member.Service.MemberService;
import com.khd.jejulantis.model.Member;

@Controller
public class MemberManagementController {

	@Autowired
	MemberService memberService;
	
	@RequestMapping(value="admin/member.do",method=RequestMethod.GET)
	public ModelAndView member() {
		List<Member> list = memberService.memberListService();
		ModelAndView mv = new ModelAndView("admin/members/member");
		mv.addObject("list", list);
		return mv;
	}
}
