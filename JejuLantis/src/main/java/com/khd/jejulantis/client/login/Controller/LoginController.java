package com.khd.jejulantis.client.login.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.khd.jejulantis.client.login.DAO.LoginDAO;
import com.khd.jejulantis.client.member.Service.MemberServiceImpl;
import com.khd.jejulantis.model.Member;

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
			Member mm = loginDAO.loginCheck(member);
			if (mm != null) {
				session.setAttribute("login", 0);	
//				Info1 = new Manager(manager.getManager_id(),manager.getBranch_no());
				session.setAttribute("log", mm);
				Member log = (Member)session.getAttribute("log");
				out.println("<script>location.href='../'; </script>");
				out.flush();
				out.close();
			}
			if (mm == null) {
				out.println("<script>alert('로그인 정보를 확인해주세요'); history.go(-1); </script>");
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

