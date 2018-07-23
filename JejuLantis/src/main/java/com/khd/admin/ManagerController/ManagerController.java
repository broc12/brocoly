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
		Manager manager1 = new Manager(null,branch_no,manager_id,manager_pwd,manager_name,manager_email,manager_birth,manager_tel1,
				manager_tel2,manager_withdraw_at,manager_main,manager_chart,manager_reservstatus,manager_ars_reserv,
				manager_travelmanagement,manager_review,manager_notice,manager_user,manager_manager,manager_company,
				manager_carkind,manager_d_carkind,manager_carinfo,manager_paystatus,manager_salestatus,manager_banner,
				manager_coupon,manager_sms,manager_insurance,"n");
		boolean flag = managerService.joinService(manager1);
		return "admin/login";
	}
}
