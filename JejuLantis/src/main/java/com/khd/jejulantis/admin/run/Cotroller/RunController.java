package com.khd.jejulantis.admin.run.Cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.khd.jejulantis.admin.approve.Service.ApproveService;
import com.khd.jejulantis.admin.run.Service.RunService;
import com.khd.jejulantis.model.Admin;
import com.khd.jejulantis.model.Manager;

@Controller
public class RunController {
	@Autowired
	RunService rservice;
	@Autowired
	ApproveService aservice;
	@RequestMapping(value="admin/admin.do",method=RequestMethod.GET)
	public ModelAndView adminList(@RequestParam("manager_id")String manager_id) {
		String view = "admin/admins/admin";
//		List<Admin> adminList = rservice.adminListService(manager_id);
		List<Admin> adminBranchNo = aservice.adminBranchNoService(manager_id);
		List<Admin> selectOne = null;
		if(adminBranchNo.get(0).getBranch_no()==1) {
			selectOne = rservice.adminListService();
		}else {
			selectOne = rservice.adminListService(manager_id);
		}
		ModelAndView mv = new ModelAndView(view, "adminList", selectOne);
		return mv;
//		return "admin/admins/admin";
	}
	@RequestMapping(value="admin/adminDelete.do",method=RequestMethod.GET)
	public String adminDelete() {
		return "redirect:admin.do";
	}
}
