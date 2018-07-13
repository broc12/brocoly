package com.khd.branch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.khd.branch.BranchService;
import com.khd.branch.Branch;

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
}
