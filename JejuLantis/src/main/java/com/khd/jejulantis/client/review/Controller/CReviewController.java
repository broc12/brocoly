package com.khd.jejulantis.client.review.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
		String view = "rentcar/board";
		ModelAndView mv = new ModelAndView(view, "branch", branch);
		return mv;
	}	
	@RequestMapping(value="boardview.do")
	public ModelAndView reviewContent(@RequestParam(value ="branch_no")int branch_no){
		String view = "rentcar/boardview";
		List<BranchName> branchContent = rservice.listServiceAll(branch_no);
		ModelAndView mv = new ModelAndView(view, "branchContent", branchContent);
		return mv;
	}
}
