package com.khd.MemberController;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
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
	@RequestMapping(value="mypage.do",method=RequestMethod.GET)
	public String mypage( HttpSession session,Model model) {

		
		Member log = (Member) session.getAttribute("log");
		String id = log.getId();
		System.out.println("id :" + id);
		Member nn = memberService.mypageService(id);

		model.addAttribute("nn", nn);
		System.out.println("id :" + nn.getId());
		return "rentcar/mypage";
	
	}
	 @RequestMapping(value = "/idcheck.do" , method = RequestMethod.POST)
	    @ResponseBody
	    public Map<Object, Object> idcheck(@RequestBody String id) {
//		 System.out.println("id1 =" +id);
	        int count = 0;
	        Map<Object, Object> map = new HashMap<Object, Object>();
//	        System.out.println("id2 =" +id);
	        count = memberService.idcheck(id);
	        map.put("cnt", count);
//	        System.out.println("id3 =" +id);
	        return map;
	    }
	 @RequestMapping(value="/modify.do", method=RequestMethod.POST)
	 public String modify(Member member, HttpSession session)  {	
			Member md = memberService.modifyService(member);
			if(md!=null) {
				md = new Member(member.getId());
				session.setAttribute("log", md);	
				System.out.println("id1 :" +member.getId());
			}			
//			System.out.println("id1 :" +member.getId());
//			System.out.println("id1 :" +member.getEmail());
//			System.out.println("id1 :" +member.getMemeber_local());
//			System.out.println("id1 :" +member.getName());
//			System.out.println("id1 :" +member.getPwd());
//			System.out.println("id1 :" +member.getTel());
//			System.out.println("id1 :" +member.getBirth());
			return "redirect:/mypage.do";
		}
	 
}
