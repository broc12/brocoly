package com.khd.MemberController;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.lang.String;

import javax.servlet.ServletResponse;
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
import org.springframework.web.servlet.ModelAndView;

import com.khd.Member.model.service.MemberService;
import com.khd.model.LoginInfo;
import com.khd.model.Member;


@Controller
public class MemberController {

	@Autowired
	MemberService memberService;
	
	@RequestMapping(value = "member/memberjoin", method = RequestMethod.POST)
	public String join(@RequestParam(value="hp1")String hp1,@RequestParam(value="hp2")String hp2,@RequestParam(value="hp3")String hp3,@RequestParam(value="id")String id,@RequestParam(value="pwd")String pwd,@RequestParam(value="name")String name,@RequestParam(value="birth1")String birth1,@RequestParam(value="birth2")String birth2,@RequestParam(value="birth3")String birth3,@RequestParam(value="memeber_local")String memeber_local,@RequestParam(value="email")String email,@RequestParam(value="sms_at", required=false)String sms_at, HttpSession session) {
		String totalbirth = birth1+"-"+birth2+"-"+birth3;
		String tel = hp1+"-"+hp2+"-"+hp3;
		//totalbirth.chars();
		//DateFormat sdFormat = new SimpleDateFormat("yyyMMdd");
		java.sql.Date dd=null;
		java.util.Date d = null;
		try {
			System.out.println(totalbirth);
		d = new SimpleDateFormat("yyyy-MM-dd").parse(totalbirth);
		}catch(ParseException pe) {}
        dd = new java.sql.Date(d.getTime());
        System.out.println("tel =" +tel);
		System.out.println("totalbirth =" +birth1+birth2+birth3);		
		Member member = new Member(null,id,pwd,name,dd,null,null,memeber_local,tel,email,sms_at,null,null,null);
		boolean flag = memberService.joinService(member);
		System.out.println("telaaa =" +tel);
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
		System.out.println("idCkkkk :" + id);	
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
	 @RequestMapping(value = "/emailcheck.do" , method = RequestMethod.POST)
	    @ResponseBody
	    public Map<Object, Object> emailcheck(@RequestBody String email) {
		 System.out.println("email =" +email);
	        int count = 0;
	        Map<Object, Object> map = new HashMap<Object, Object>();
//	        System.out.println("id2 =" +id);
	        count = memberService.emailcheck(email);
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
	 @RequestMapping(value="delete.do")
		public String delete(HttpSession session) {
		 System.out.println("id1:"+ session.getId());	
//		 System.out.println("i지나감1111 :----------" );	
		 Member log = (Member) session.getAttribute("log");
		 System.out.println("id2:"+ session.getId());
//			System.out.println("i지나감 :----------" );
			String id1 = log.getId();
			System.out.println("idwqeqwqwe:"+ id1);
//		 session.removeAttribute(id1);
		 System.out.println("id7777:"+ id1);	
		 int dm = memberService.deleteService(id1);
		 session.removeAttribute("log");
//		 session.removeAttribute(id1);
		 System.out.println("idwqeqwqwe:"+ id1);
//		 System.out.println("id3:"+ session.getId());
//		 session.removeValue(id1);
//		 session.removeAttribute(id1);
//		 session.removeAttribute(id1);
			return "rentcar/login";
		
		}
	// 아이디 찾기
		@RequestMapping(value = "/find_id.do", method = RequestMethod.POST)
		public String find_id(HttpServletResponse response, @RequestParam("email") String email, Model md) throws Exception{
			
//			System.out.println("지나감!!!!!");
//			 System.out.println("email11111:"+ email);
			 PrintWriter out = response.getWriter();
			 String id = memberService.find_id(email);
			 if (id == null) {
					out.println("<script>");
					out.println("alert('가입된 아이디가 없습니다.');");
					out.println("history.go(-1);");
					out.println("</script>");
					out.close();
					return null;
				} else {
					md.addAttribute("id", memberService.find_id(email));
				}
			 return "/rentcar/find_id";
			
		}
		// 비밀번호 찾기
				@RequestMapping(value = "/find_pwd.do", method = RequestMethod.POST)
				public String find_pwd(HttpServletRequest request,HttpServletResponse response, @RequestParam("id") String id, Model md) throws Exception{
					
					request.setCharacterEncoding("utf-8");
					System.out.println("지나감!!!!!");
					 System.out.println("id11111:"+ id);
					 PrintWriter out = response.getWriter();
					 String pwd = memberService.find_pwd(id);
					 System.out.println("pwd222221:"+ pwd);
					 if (pwd == null) {
							out.println("<script>");
							out.println("alert('가입된 아이디가 없습니다.');");
							out.println("history.go(-1);");
							out.println("</script>");
							out.close();
							return null;
						} else {
							md.addAttribute("pwd", memberService.find_pwd(id));
						}
					 return "/rentcar/find_pwd";
					
				}

}
