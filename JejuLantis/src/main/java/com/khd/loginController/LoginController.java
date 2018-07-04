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
import org.springframework.web.servlet.ModelAndView;

import com.khd.loginDAO.LoginDAO;
import com.khd.model.LoginInfo;

/**
 * Handles requests for the application home page.
 */
@Controller
public class LoginController {
	@Autowired
	LoginDAO loginDAO;

	@RequestMapping(value = "/login/loginCheck")
	public void loginCheck(Locale locale, Model model, LoginInfo loginInfo, HttpSession session,
			HttpServletResponse response) throws IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		System.out.println(loginInfo.getId());
		if ((loginInfo.getId() != null && !loginInfo.getId().equals("") && loginInfo.getPassword() != null
				&& !loginInfo.getPassword().equals(""))) {

			if (loginDAO.loginCheck(loginInfo)) {
				session.setAttribute("login", 0); // 로그인 성공시 세션
				System.out.println("s");
				session.setAttribute("id", loginInfo.getId());
				System.out.println("ss");
				String id = session.getAttribute("id").toString();

				out.println("<script>location.href='../'; </script>");
				out.flush();
				out.close();
			}
			if (loginDAO.loginCheck(loginInfo) == false) {
				out.println("<script>alert('로그인 정보를 확인하세요!'); history.go(-1); </script>");
				out.flush();
				out.close();
			}
		}
	}

	@RequestMapping(value = "/login/logout")
	public ModelAndView logOut(ModelAndView mv, HttpSession session) {
		String page = "redirect:/";
		session.removeAttribute("id");
		System.out.println("성공5");
		mv.setViewName(page);
		;
		return mv;
	}

}
