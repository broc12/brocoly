package com.khd.jejulantis.client.review.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.khd.jejulantis.client.review.Service.CReviewService;
import com.khd.jejulantis.model.BranchName;

@Controller
public class CReviewController {
	
	@Autowired
	private CReviewService rservice;
	
	@RequestMapping(value="board.do")
	public ModelAndView board(@RequestParam(value ="searchValue", required= false)String searchValue){
		List<BranchName> branch = null;
		if(searchValue == null) {
			branch = rservice.listService();
		}else if(searchValue != null){
			branch = rservice.selectService(searchValue);
		}
		String view = "rentcar/reviews/board";
		ModelAndView mv = new ModelAndView(view, "branch", branch);
		return mv;
	}	
	@RequestMapping(value="boardview.do")
	public ModelAndView reviewContent(@RequestParam(value ="branch_no")int branch_no){
		String view = "rentcar/reviews/boardview";
		List<BranchName> branchContent = rservice.listServiceAll(branch_no);
		ModelAndView mv = new ModelAndView(view, "branchContent", branchContent);
		return mv;
	}
	@RequestMapping(value="test.do")
	public String test(){
		return "rentcar/reviews/test";
	}
	@RequestMapping(value="test1.do",method=RequestMethod.POST)
	public String test1(
			@RequestParam("branch_lati")String branch_lati,
			@RequestParam("branch_long")String branch_long){
		System.out.println("branch_lati : " + branch_lati);
		System.out.println("branch_long : " + branch_long);
		return "rentcar/reviews/test1";
	}
}
