package com.khd.jejulantis.admin.approve.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.khd.jejulantis.admin.approve.Service.ApproveService;
import com.khd.jejulantis.model.Admin;
import com.khd.jejulantis.model.Manager;

@Controller
public class ApproveController {
	@Autowired
	ApproveService aservice;
	@RequestMapping(value="admin/adminApprove.do")
	public ModelAndView adminApproveList(@RequestParam("manager_id")String manager_id) {
		String view = "";
		ModelAndView mv = null;
		List<Admin> adminBranchNo = aservice.adminBranchNoService(manager_id);
		System.out.println("test : " + adminBranchNo.size());
		List<Admin> selectOne;
		if(adminBranchNo.get(0).getBranch_no()==1) {
			view = "admin/approves/approve";
			selectOne = aservice.adminApproveListService();
			mv = new ModelAndView(view, "adminApproveList", selectOne);
		}else {
			view = "redirect:index.do";
			mv = new ModelAndView(view);
		}
		return mv;
//		return "admin/approves/approve";
	}
	@RequestMapping(value="admin/adminApproveYes.do")
	public String adminApproveYes(@RequestParam("manager_no")long manager_no, HttpSession session) {
		Manager log = (Manager)session.getAttribute("managerlog");
		aservice.adminApproveYesSelect(manager_no);
		return "redirect:adminApprove.do?manager_id="+log.getManager_id(); 
	}
	@RequestMapping(value="admin/adminApproveNo.do")
	public String adminApproveNo(@RequestParam("manager_no")long manager_no, HttpSession session) {
		Manager log = (Manager)session.getAttribute("managerlog");
		aservice.adminApproveNoSelect(manager_no);
		return "redirect:adminApprove.do?manager_id="+log.getManager_id(); 
	}
}
