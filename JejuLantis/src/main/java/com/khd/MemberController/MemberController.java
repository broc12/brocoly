package com.khd.MemberController;

import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.lang.String;

import javax.servlet.http.HttpServletRequest;
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

import com.khd.Member.model.service.MemberService;
import com.khd.model.LoginInfo;
import com.khd.model.Member;


@Controller
public class MemberController {

	@Autowired
	MemberService memberService;
	
	@RequestMapping(value = "member/memberjoin", method = RequestMethod.POST)
	public String join(Member member,@RequestParam(value="hp1")String hp1,@RequestParam(value="hp2")String hp2,@RequestParam(value="hp3")String hp3,@RequestParam(value="birth1")String birth1,@RequestParam(value="birth2")String birth2,@RequestParam(value="birth3")String birth3, HttpSession session) {
		//@RequestParam(value="member_name")String member_name,@RequestParam(value="member_id")String member_id,@RequestParam(value="member_pwd")String member_pwd,@RequestParam(value="hp1")String hp1,@RequestParam(value="hp2")String hp2,@RequestParam(value="hp3")String hp3,@RequestParam(value="birth1")String birth1,@RequestParam(value="birth2")String birth2,@RequestParam(value="birth3")String birth3,@RequestParam(value="member_local")String member_local,@RequestParam(value="member_email")String member_email,@RequestParam(value="member_sms_at", required=false)String member_sms_at, HttpSession session) {
		String totalbirth = birth1+"-"+birth2+"-"+birth3;
		String member_tel = hp1+"-"+hp2+"-"+hp3;
		java.sql.Date dd = null;
		java.util.Date d = null;
		try {
			System.out.println(totalbirth);
		d = new SimpleDateFormat("yyyy-MM-dd").parse(totalbirth);
		}catch(ParseException pe) {}
        dd = new java.sql.Date(d.getTime());
        member.setMember_tel(member_tel);
		member.setMember_birth(dd);
        boolean flag = memberService.joinService(member);
		LoginInfo log = null;
		if(flag) {
			log = new LoginInfo(member.getMember_id());
		}	
		return "redirect:../login.do";		
	}
	@RequestMapping(value="mypage.do",method=RequestMethod.GET)
	public String mypage( HttpSession session,Model model) {
	
		Member log = (Member) session.getAttribute("log");
		String member_id = log.getMember_id();		
		System.out.println("idCkkkk :" + member_id);	
		Member nn = memberService.mypageService(member_id);
		model.addAttribute("nn", nn);
		System.out.println("id :" + nn.getMember_id());
		return "rentcar/mypage";
	
	}
	 @RequestMapping(value = "/idcheck.do" , method = RequestMethod.POST)
	    @ResponseBody
	    public Map<Object, Object> idcheck(@RequestBody String member_id) {
	        int count = 0;
	        Map<Object, Object> map = new HashMap<Object, Object>();
	        count = memberService.idcheck(member_id);
	        map.put("cnt", count);
	        return map;
	    }
	 @RequestMapping(value = "/emailcheck.do" , method = RequestMethod.POST)
	    @ResponseBody
	    public Map<Object, Object> emailcheck(@RequestBody String member_email) {
		 System.out.println("member_email =" +member_email);
	        int count = 0;
	        Map<Object, Object> map = new HashMap<Object, Object>();
	        count = memberService.emailcheck(member_email);
	        map.put("cnt", count);
	        return map;
	    }
	 @RequestMapping(value="/modify.do", method=RequestMethod.POST)
	 public String modify(Member member, HttpSession session)  {	
			Member md = memberService.modifyService(member);
			if(md!=null) {
				md = new Member(member.getMember_id());
				session.setAttribute("log", md);	
				System.out.println("id1 :" +member.getMember_id());
			}			
			return "redirect:/mypage.do";
		}
	 @RequestMapping(value="delete.do")
		public String delete(HttpSession session) {
		 System.out.println("id1:"+ session.getId());		
		 Member log = (Member) session.getAttribute("log");
		 System.out.println("id2:"+ session.getId());
			String member_id = log.getMember_id();
			System.out.println("idwqeqwqwe:"+ member_id);
		 System.out.println("id7777:"+ member_id);	
		 int dm = memberService.deleteService(member_id);
		 session.removeAttribute("log");
		 System.out.println("idwqeqwqwe:"+ member_id);
			return "rentcar/login";
		
		}
		@RequestMapping(value = "/find_id.do", method = RequestMethod.POST)
		public String find_id(HttpServletResponse response, @RequestParam("member_email") String member_email, Model md) throws Exception{

			 PrintWriter out = response.getWriter();
			 String member_id = memberService.find_id(member_email);
			 if (member_id == null) {
					out.println("<script>");
					out.println("alert('');");
					out.println("history.go(-1);");
					out.println("</script>");
					out.close();
					return null;
				} else {
					md.addAttribute("member_id", memberService.find_id(member_email));
				}
			 return "/rentcar/find_id";
			
		}
				@RequestMapping(value = "/find_pwd.do", method = RequestMethod.POST)
				public String find_pwd(HttpServletRequest request,HttpServletResponse response, @RequestParam("member_id") String member_id, Model md) throws Exception{
					
					request.setCharacterEncoding("utf-8");
					System.out.println("");
					 System.out.println("id11111:"+ member_id);
					 PrintWriter out = response.getWriter();
					 String member_pwd = memberService.find_pwd(member_id);
					 System.out.println("pwd222221:"+ member_pwd);
					 if (member_pwd == null) {
							out.println("<script>");
							out.println("alert('');");
							out.println("history.go(-1);");
							out.println("</script>");
							out.close();
							return null;
						} else {
							md.addAttribute("member_pwd", memberService.find_pwd(member_id));
						}
					 return "/rentcar/find_pwd";
					
				}

}
