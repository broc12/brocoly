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
	public void loginCheck(Member member, HttpSession session,
			HttpServletResponse response) throws IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		if ((member.getMember_id()!= null && !member.getMember_id().equals("") && member.getMember_pwd()!= null
				&& !member.getMember_pwd().equals(""))) {
			Member Info = null;
			if (loginDAO.loginCheck(member)) {
				session.setAttribute("login", 0);	
				Info = new Member(member.getMember_id());
				session.setAttribute("log", Info);
				Member log = (Member)session.getAttribute("log");
				out.println("<script>location.href='../'; </script>");
				out.flush();
				out.close();
			}
			if (loginDAO.loginCheck(member) == false) {
				out.println("<script>alert('로그인정보를확인하세요'); history.go(-1); </script>");
				out.flush();
				out.close();
			}
		}
	}

	@RequestMapping(value = "/login/logout")
	public ModelAndView logOut(ModelAndView mv, HttpSession session) {
		
		String page = "redirect:/";
		session.removeAttribute("log");
//		System.out.println("");
//		System.out.println( "page :" + page);
		mv.setViewName(page);
//		System.out.println("mv :" + mv);
		return mv;
		}


}
