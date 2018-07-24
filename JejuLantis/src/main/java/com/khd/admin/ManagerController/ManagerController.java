package com.khd.admin.ManagerController;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

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


@Controller
public class ManagerController {
		
	@Autowired
	ManagerService managerService;
	
	@RequestMapping(value="admin/register.do",method=RequestMethod.GET)
	public String register() {
		return "admin/register";
	}
	@RequestMapping(value="resist.do", method=RequestMethod.POST)
	public String join(Manager manager,@RequestParam(value="birth1")String birth1,@RequestParam(value="hp1")String hp1,@RequestParam(value="hp2")String hp2,@RequestParam(value="hp3")String hp3,@RequestParam(value="birth2")String birth2,@RequestParam(value="birth3")String birth3) {
		System.out.println("지나감");
		String manager_birth = birth1+"-"+birth2+"-"+birth3;
		String manager_tel1 = hp1+"-"+hp2+"-"+hp3;
//		String manager_birth =  manager.getManager_birth();
//		Manager manager1 = new Manager(null,null,manager_id,manager_pwd,manager_name,manager_email,manager_birth,manager_tel1,
//				manager_tel2,"N","N","N","N","N",
//				"N","N","N","N","N","N",
//				"N","N","N","N","N","N",
//				"N","N","N",null);
//		boolean flag = managerService.joinService(manager1);
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
	 @RequestMapping(value = "/idcheckmanager.do" , method = RequestMethod.POST)
	    @ResponseBody
	    public Map<Object, Object> idcheck(@RequestBody String manager_id) {
//		 System.out.println("id1 =" +manager_id);
	        int count = 0;
	        Map<Object, Object> map = new HashMap<Object, Object>();
//	        System.out.println("id2 =" +member_id);
	        count = managerService.idcheck(manager_id);
	        map.put("cnt", count);
//	        System.out.println("id3 =" +member_id);
	        return map;
	    }
	 @RequestMapping(value = "/emailcheckmanager.do" , method = RequestMethod.POST)
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
}
