package com.khd.branch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.khd.branch.Branch;
import com.khd.branch.BranchService;

@Controller
public class BranchController {
	
	@Autowired
	private BranchService service;
	
	@RequestMapping(value="admin/enter.do",method=RequestMethod.GET)
	public ModelAndView enter() {
		List<Branch>list = service.listService();
		String view = "admin/enter";
		ModelAndView mv = new ModelAndView(view,"list",list);
		return mv;	
	}
	
/*	@RequestMapping(value="admin/branchadd.do",method=RequestMethod.POST)
	public String insert(@RequestParam("branch_name")String branch_name,@RequestParam("branch_tel")String branch_tel,@RequestParam("branch_fax")String branch_fax,
			@RequestParam("branch_local")String branch_local,@RequestParam("branch_business_no")String branch_business_no,@RequestParam("branch_bankaccount")String branch_bankaccount,
			@RequestParam("branch_member_name")String branch_member_name,@RequestParam("branch_member_tel")String branch_member_tel,@RequestParam("branch_member_tel2")String branch_member_tel2,
			@RequestParam("branch_email")String branch_email,@RequestParam("branch_logo")String branch_logo,@RequestParam("branch_comfee")long branch_comfee,
			@RequestParam("branch_busspot")String branch_busspot,@RequestParam("branch_bustime")String branch_bustime,
			@RequestParam("branch_busgap")String branch_busgap,@RequestParam("branch_boss")String branch_boss,@RequestParam("branch_today")String branch_today,
			@RequestParam("branch_todaytime")String branch_todaytime,@RequestParam("branch_rule")String branch_rule) {
		Branch branch = new Branch(null,branch_name,branch_tel,branch_fax,branch_local,null,branch_business_no,branch_bankaccount,branch_member_name,
				branch_member_tel,branch_member_tel2,branch_email,branch_logo,branch_comfee,null,branch_busspot,branch_bustime,branch_busgap,branch_boss,branch_today,branch_todaytime,branch_rule);
		service.insertService(branch);
		return "redirect:enter.do";
	}*/
	@RequestMapping(value="admin/branchadd.do",method=RequestMethod.POST)
	public String insert(Branch branch) {
		service.insertService(branch);
		return "redirect:enter.do";
	}
	@RequestMapping(value="admin/branchSubject.do",method=RequestMethod.GET)
	public ModelAndView branchModify(@RequestParam("branch_no")long branch_no) {
		List<Branch>subject = service.subjectService(branch_no);
		String view = "admin/branchModify";
		ModelAndView mv = new ModelAndView(view,"subject",subject);
		return mv;
	}
	@RequestMapping(value="admin/branchfull.do",method=RequestMethod.GET)
	public ModelAndView branchfull(@RequestParam("branch_no")long branch_no) {
		List<Branch>subject = service.fullService(branch_no);
		String view = "admin/branchfull";
		ModelAndView mv = new ModelAndView(view,"subject",subject);
		return mv;
	}
	
	@RequestMapping(value="admin/branchModify.do",method=RequestMethod.POST)
	public String modify(Branch branch) {
		service.modifyService(branch);
		return "redirect:enter.do";
	}
	@RequestMapping(value="admin/branchWithdraw.do",method=RequestMethod.GET)
	public String withdraw(long branch_no) {
		service.withdrawService(branch_no);
		return "redirect:enter.do";
	}
	@RequestMapping(value="admin/branch.do",method=RequestMethod.GET)
	public String branch() {
		return "admin/branch";
	}
}
