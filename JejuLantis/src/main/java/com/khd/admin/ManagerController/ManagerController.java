package com.khd.admin.ManagerController;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.Long;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.khd.admin.ManagerModel.Manager;
import com.khd.admin.ManagerService.ManagerService;
import com.khd.branch.Branch;
import com.khd.model.Member;


@Controller
public class ManagerController {
		
	@Autowired
	ManagerService managerService;
	
	@RequestMapping(value="admin/login.do",method=RequestMethod.GET)
	public String login() {
		return "admin/login";
	}
	@RequestMapping(value="admin/register.do",method=RequestMethod.GET)
	public String register() {
		return "admin/register";
	}
	@RequestMapping(value="admin/manager.do", method=RequestMethod.POST)
	public String join(Manager manager,@RequestParam(value="hp1")String hp1,@RequestParam(value="hp2")String hp2,@RequestParam(value="hp3")String hp3,@RequestParam(value="hp4")String hp4,@RequestParam(value="hp5")String hp5,@RequestParam(value="hp6")String hp6,@RequestParam(value="birth1")String birth1,@RequestParam(value="birth2")String birth2,@RequestParam(value="birth3")String birth3) {
		System.out.println("지나감99");
		System.out.println(manager.getBranch_no());
		String manager_birth = birth1+"-"+birth2+"-"+birth3;
		String manager_tel1 = hp1+"-"+hp2+"-"+hp3;
		if( hp4 == null && hp5 == null && hp6 == null) {
			String manager_tel2 = null;	
		}else{
			String manager_tel2 = hp4+"-"+hp5+"-"+hp6;
		}
		String manager_tel2 = hp4+"-"+hp5+"-"+hp6;
		manager.setManager_tel1(manager_tel1);
		manager.setManager_tel2(manager_tel2);
		manager.setManager_birth(manager_birth);
//		String manager_birth =  manager.getManager_birth();
//		Manager manager1 = new Manager(null,null,manager_id,manager_pwd,manager_name,manager_email,manager_birth,manager_tel1,
//				manager_tel2,"N","N","N","N","N",
//				"N","N","N","N","N","N",
//				"N","N","N","N","N","N",
//				"N","N","N",null);
//		System.out.println("branch_no"+ manager.getBranch_no());
		boolean flag = managerService.joinService(manager);
		return "admin/login";
	}
	@RequestMapping(value = "admin/post", method = RequestMethod.GET)
	public void get(){
		
	}
	@RequestMapping(value = "admin/post", method = RequestMethod.POST)
	public ModelAndView post(Locale locale,Branch branch,HttpServletRequest request, @RequestParam(value = "branch_name", required=false) String branch_name){
			
	/*	String address = request.getParameter("address");
	*/	
		
		ModelAndView result = new ModelAndView();
		if(branch_name != ""){
			List<Branch> branchList = managerService.postService(branch_name);
			
			for (Branch post : branchList) {
				
				System.out.println("업체명 "+post.getBranch_name());
				System.out.println("업체주소"+post.getBranch_local());
				System.out.println("업체번호"+post.getBranch_member_tel());				
			}
			
			result.addObject("result", branchList);
			result.setViewName("admin/post");
			return result;
			
		}else{
			result.addObject("nullResult", "검색해주세요.");
			result.setViewName("admin/post");
			return result;
		}
	}
	@RequestMapping(value = "/main")
	public String main(){
		return "main";
	}
	 @RequestMapping(value = "admin/idcheckmanager.do" , method = RequestMethod.POST)
	    @ResponseBody
	    public Map<Object, Object> idcheck(@RequestBody String manager_id) {
		 System.out.println("id1 =" +manager_id);
	        int count = 0;
	        Map<Object, Object> map = new HashMap<Object, Object>();
//	        System.out.println("id2 =" +member_id);
	        count = managerService.idcheck(manager_id);
	        map.put("cnt", count);
//	        System.out.println("id3 =" +member_id);
	        return map;
	    }
	 @RequestMapping(value = "admin/emailcheckmanager.do" , method = RequestMethod.POST)
	    @ResponseBody
	    public Map<Object, Object> emailcheck(@RequestBody String manager_email) {
		 System.out.println("manager_email =" +manager_email);
	        int count = 0;
	        Map<Object, Object> map = new HashMap<Object, Object>();
//	        System.out.println("id2 =" +id);
	        count = managerService.emailcheck(manager_email);
	        map.put("cnt", count);
//	        System.out.println("id3 =" +id);
	        return map;
	    }
	 @RequestMapping(value = "/Managerlogin/ManagerloginCheck",method = RequestMethod.POST)
		public void loginCheck(Manager manager,HttpSession session,HttpServletResponse request,
				HttpServletResponse response) throws IOException {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			if ((manager.getManager_id()!= null && !manager.getManager_id().equals("") && manager.getManager_pwd()!= null
					&& !manager.getManager_pwd().equals(""))) {
				 System.out.println("getManager_id =" +manager.getManager_id());
				 System.out.println("getManager_pwd =" + manager.getManager_pwd());
				Manager Info1 = null;
				 Manager nn = managerService.loginCheck(manager);
				if (nn != null) {					 
					session.setAttribute("managerlogin", 0);	
//					Info1 = new Manager(manager.getManager_id(),manager.getBranch_no());
					session.setAttribute("managerlog", nn);
					Manager managerlog = (Manager)session.getAttribute("managerlog");
					out.println("<script>location.href='/jejulantis/admin/index.do'; </script>");
					out.flush();
					out.close();
				}
				if (nn == null) {
					out.println("<script>alert('로그인정보를확인하세요'); history.go(-1); </script>");
					out.flush();
					out.close();
				}
			}
			 System.out.println("getManager_id 1111=" +manager.getManager_id());
			 System.out.println("getManager_pwd 1111=" + manager.getManager_pwd());
		}

		@RequestMapping(value = "/managerlogin/managerlogout")
		public ModelAndView logOut(ModelAndView mv, HttpSession session) {
			System.out.println("지나간다");
			String page = "redirect:/admin/index.do";
			session.removeAttribute("managerlog");
//			System.out.println("");
//			System.out.println( "page :" + page);
			mv.setViewName(page);
//			System.out.println("mv :" + mv);
			return mv;
			}

}
