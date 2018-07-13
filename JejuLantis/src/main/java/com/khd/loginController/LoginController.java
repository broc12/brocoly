package com.khd.loginController;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.khd.loginDAO.LoginDAO;
import com.khd.model.LoginInfo;
import com.khd.model.Member;

import com.khd.Member.model.service.MemberServiceImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
public class LoginController {
	@Autowired
	LoginDAO loginDAO;
	MemberServiceImpl ms = new MemberServiceImpl();

	@RequestMapping(value = "/login/loginCheck")
	public void loginCheck(Locale locale, Model model, Member member, HttpSession session,
			HttpServletResponse response) throws IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		if ((member.getId() != null && !member.getId().equals("") && member.getPwd() != null
				&& !member.getPwd().equals(""))) {
			Member Info = null;
			if (loginDAO.loginCheck(member)) {
				session.setAttribute("login", 0); // 로그인 성공시 세션			
				Info = new Member(member.getId());
				session.setAttribute("log", Info);
				Member log = (Member)session.getAttribute("log");
				out.println("<script>location.href='../'; </script>");
				out.flush();
				out.close();
			}
			if (loginDAO.loginCheck(member) == false) {
				out.println("<script>alert('로그인 정보를 확인하세요!'); history.go(-1); </script>");
				out.flush();
				out.close();
			}
		}
	}

	@RequestMapping(value = "/login/logout")
	public ModelAndView logOut(ModelAndView mv, HttpSession session) {
		String page = "redirect:/";
		session.removeAttribute("log");
//		System.out.println("성공5");
//		System.out.println( "page :" + page);
		mv.setViewName(page);
//		System.out.println("mv :" + mv);
		return mv;
		}

//	@RequestMapping("mypage.do")
//    public String memberView(Member member, Model model){
//        // 회원 정보를 model에 저장
//       model.addAttribute("dto", MemberService.viewMember(member));
//        
//        return "member/member_view";
//    }
//	
//	@RequestMapping(value="mypage.do",method=RequestMethod.GET)
//	public String mypage() {	
//		System.out.println("----- 지나감");
//		return "rentcar/mypage";
//	}
//	@RequestMapping(value = "/membersmodify.do" )		
//	public ModelAndView members(HttpSession session){
//		ModelAndView mav = new ModelAndView();
//		String member_id = (String)session.getAttribute("id");
//		if ( member_id == null) {		//session check
//			mav.setViewName("");
//			return mav;
//		}
//		mav.addObject("id",member_id);
//		mav.addObject("member_info", MemberDAO.getMemberInfo(member_id));
//		mav.setViewName("/members/members_modify");
//		return mav;
//	}





//    @RequestMapping(value="/login/mypage", method=RequestMethod.POST)
//    public String editAccount(Member member, HttpSession session) throws Exception {
//    	Member loginUser = (Member) session.getAttribute("log");
//        String id = loginUser.getId(); //세션에 저장된 사용자 정보로부터 id을 알아낸다.
//       
//        if (member.getName() == null) {
//        	member.setName(loginUser.getName());
//        }
//        if (member.getTel() == null) {
//        	member.setTel(loginUser.getTel());
//        }
//       
//        member.setEmail(email);
//        int check = MemberService.modify(member);
//        if (check == 1) {
//            session.setAttribute("log",member);
//        }
//       
//        return "users/changePasswd";
//       
//    }
}
