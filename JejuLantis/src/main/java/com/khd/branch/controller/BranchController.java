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
