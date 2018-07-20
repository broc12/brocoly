package com.khd.admin.ManagerController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.khd.admin.ManagerModel.Manager;
import com.khd.admin.ManagerService.ManagerService;

@Controller
public class ManagerController {
		
	@Autowired
	ManagerService managerService;
	
	@RequestMapping(value="admin/resist.do", method=RequestMethod.POST)
	public String join(Manager manager,@RequestParam(value="birth1")String birth1,@RequestParam(value="birth2")String birth2,@RequestParam(value="birth3")String birth3) {
		System.out.println("Áö³ª°¨");
		String manager_birth = birth1+"-"+birth2+"-"+birth3;
//		Manager manager1 = new Manager();
		boolean flag = managerService.joinService(manager);
		return "admin/login";
	}
}
