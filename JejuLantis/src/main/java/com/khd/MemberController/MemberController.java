package com.khd.MemberController;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.khd.Member.model.service.MemberService;
import com.khd.model.LoginInfo;
import com.khd.model.Member;


@Controller
public class MemberController {

	@Autowired
	MemberService memberService;
//	pwd,name,birth,null,null,member_local,tel,email,sms_at,null,null,null
//	,@RequestParam(value="pwd")String pwd,@RequestParam(value="name")String name,@RequestParam(value="birth")Date birth,@RequestParam(value="member_local")String member_local,@RequestParam(value="tel")String tel,@RequestParam(value="email")String email,@RequestParam(value="sms_at")String sms_at, HttpSession session
	
	
	@RequestMapping(value = "member/memberjoin", method = RequestMethod.POST)
	public String join(@RequestParam(value="id")String id,@RequestParam(value="pwd")String pwd,@RequestParam(value="name")String name,@RequestParam(value="birth1")String birth1,@RequestParam(value="birth2")String birth2,@RequestParam(value="birth3")String birth3,@RequestParam(value="memeber_local")String memeber_local,@RequestParam(value="tel")String tel,@RequestParam(value="email")String email,@RequestParam(value="sms_at", required=false)String sms_at, HttpSession session) {
		String totalbirth = birth1+"-"+birth2+"-"+birth3;
		//totalbirth.chars();
		//DateFormat sdFormat = new SimpleDateFormat("yyyMMdd");
		java.sql.Date dd=null;
		java.util.Date d = null;
		try {
			System.out.println(totalbirth);
		d = new SimpleDateFormat("yyyy-MM-dd").parse(totalbirth);
		}catch(ParseException pe) {}
        dd = new java.sql.Date(d.getTime());


		System.out.println("totalbirth =" +birth1+birth2+birth3);
		
		Member member = new Member(null,id,pwd,name,dd,null,null,memeber_local,tel,email,sms_at,null,null,null);
		boolean flag = memberService.joinService(member);
		LoginInfo log = null;
		if(flag) {
			log = new LoginInfo(id);
		}
//		session.setAttribute("log", log);
		
		return "redirect:../login.do";
		
	}
}
//	@RequestMapping(value = "member/confirm.do", method = RequestMethod.GET)
//	public String confirm() {
//		return null;
//	}
//	@RequestMapping(value = "member/confirm.do", method = RequestMethod.POST)
//	public String confirm(@RequestParam(value="member")Member member, HttpSession session) {
//	
//		boolean flag = memberService.confirmService(member);
//		//System.out.println(flag);
//		LoginInfo log = null;
//		if(flag) {
//			member = new Member(member.getId());
//			
//		}
//		session.setAttribute("log", log);
//		
//		return "member/confirm";
//	}
//
//	
//}
