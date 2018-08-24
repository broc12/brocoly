package com.khd.jejulantis.client.member.Controller;

import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.khd.jejulantis.admin.sms.Service.SmsService;
import com.khd.jejulantis.client.member.Service.MemberService;
import com.khd.jejulantis.model.LoginInfo;
import com.khd.jejulantis.model.Manager;
import com.khd.jejulantis.model.Member;


@Controller
public class MemberController {

	@Autowired
	MemberService memberService;
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	@Autowired
	private SmsService sservice;
	
	@RequestMapping(value = "member/memberjoin", method = RequestMethod.POST)
	public String join(Member member,@RequestParam(value="hp1")String hp1,@RequestParam(value="hp2")String hp2,@RequestParam(value="hp3")String hp3,@RequestParam(value="birth1")String birth1,@RequestParam(value="birth2")String birth2,@RequestParam(value="birth3")String birth3, HttpSession session) {
		//@RequestParam(value="member_name")String member_name,@RequestParam(value="member_id")String member_id,@RequestParam(value="member_pwd")String member_pwd,@RequestParam(value="hp1")String hp1,@RequestParam(value="hp2")String hp2,@RequestParam(value="hp3")String hp3,@RequestParam(value="birth1")String birth1,@RequestParam(value="birth2")String birth2,@RequestParam(value="birth3")String birth3,@RequestParam(value="member_local")String member_local,@RequestParam(value="member_email")String member_email,@RequestParam(value="member_sms_at", required=false)String member_sms_at, HttpSession session) {
		String member_birth = birth1+"-"+birth2+"-"+birth3;
		String member_tel = hp1+"-"+hp2+"-"+hp3;
        member.setMember_tel(member_tel);
		member.setMember_birth(member_birth);
		
		String member_pwd = member.getMember_pwd();
		
		if(StringUtils.hasText(member_pwd)) {
			String bCryptString = passwordEncoder.encode(member_pwd);
			member.setMember_pwd(bCryptString);
		}
		
        boolean flag = memberService.joinService(member);		
		return "redirect:../login.do";		
	}
	@RequestMapping(value="mypage.do",method=RequestMethod.GET)
	public String mypage( HttpSession session,Model model,Member member) {
	
		Member log = (Member) session.getAttribute("log");
		String member_id = log.getMember_id();
		String member_birth = log.getMember_birth();
		String member_tel = log.getMember_tel();
		Member nn = memberService.mypageService(member_id);	
		//String member_id = nn.getMember_id();		
//		String member_birth1 = nn.getMember_birth1();	
		System.out.println("idCkkkk :" + member_id);	
		model.addAttribute("nn", nn);
		System.out.println("id :" + nn.getMember_id());
		System.out.println("getMember_birth :" + nn.getMember_birth());
		System.out.println("getMember_tel :" + nn.getMember_tel());
		System.out.println("getMember_local :" + nn.getMember_local());
		System.out.println("getMember_name :" + nn.getMember_name());
	
		return "rentcar/mypages/mypage";
	
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
		 System.out.println("tel123 :" +member.getMember_tel());
		 System.out.println("birth123 :" +member.getMember_birth());
		 System.out.println("pwd :" +member.getMember_pwd());
		 Member md = memberService.modifyService(member);
			if(md!=null) {				
				session.setAttribute("log", md);	
				System.out.println("id1 :" +member.getMember_id());
				 System.out.println("pwdpwd :" +member.getMember_pwd());
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
			return "rentcar/users/login";
		
		}
		@RequestMapping(value = "/find_id.do", method = RequestMethod.POST)
		public String find_id(HttpServletResponse response, @RequestParam("member_email") String member_email, Model md) throws Exception{
			 System.out.println("지나감123456");
			 response.setCharacterEncoding("UTF-8");
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
			 String member_id = memberService.find_id(member_email);
			 if (member_id == null) {
				 out.println("<script language='javascript'>");
					out.println("alert('일치하지 않습니다');");
					out.println("history.go(-1);");
					out.println("</script>");
					out.close();
					return null;
				} else {
					md.addAttribute("member_id", memberService.find_id(member_email));
				}
			 return "/rentcar/users/find_id";
			
		}
				@RequestMapping(value = "/find_pwd.do", method = RequestMethod.POST)
				public String find_pwd(HttpServletRequest request,HttpServletResponse response, @RequestParam("member_id") String member_id, Model md) throws Exception{
					response.setCharacterEncoding("UTF-8");
					response.setContentType("text/html; charset=UTF-8");
					PrintWriter out = response.getWriter();
					System.out.println("");
					 System.out.println("id11111:"+ member_id);				
					 String member_pwd = memberService.find_pwd(member_id);
					 System.out.println("pwd222221:"+ member_pwd);
					 if (member_pwd == null) {
						 	out.println("<script language='javascript'>");
							out.println("alert('일치하지 않습니다');");
							out.println("history.go(-1);");
							out.println("</script>");
							out.close();
							return null;
						} else {
							md.addAttribute("member_pwd", memberService.find_pwd(member_id));
						}
					 return "/rentcar/users/find_pwd";
					
				}
				// 비밀번호 찾기
				@RequestMapping(value = "/memberfind_pwd.do", method = RequestMethod.POST)
				public void find_pw(@ModelAttribute Member member, HttpServletResponse response,@RequestParam("member_id") String member_id,@RequestParam("member_email") String member_email, Model md) throws Exception{	
					System.out.println("email"+ member_email);
					memberService.find_pw(response, member, member_id,member_email, md);
				}
				@RequestMapping(value = "mypages/memberCheckPwd.do",method=RequestMethod.POST)
				public String CheckPwd(Member member, HttpSession session) {
					 String member_pwd = member.getMember_pwd();	
					 if(StringUtils.hasText(member_pwd)) {
							String bCryptString = passwordEncoder.encode(member_pwd);
							member.setMember_pwd(bCryptString);
						}
					 memberService.changePwd(member);
					 session.removeAttribute("log");
					 System.out.println("member_pwd123123"+ member_pwd);
					return "redirect:../login.do";	
				}

}
