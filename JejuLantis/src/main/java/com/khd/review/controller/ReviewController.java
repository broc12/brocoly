package com.khd.review.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.khd.review.BranchName;
import com.khd.review.ReviewContent;
import com.khd.review.ReviewService;

@Controller
public class ReviewController {

	@Autowired
	private ReviewService rservice;
	
	@RequestMapping(value="admin/list.do",method=RequestMethod.GET)
	public ModelAndView admin_list() {
		List<ReviewContent> list_ = rservice.listServiceAll();
		String view = "admin/list";
		System.out.println("list_ : " + list_);
		ModelAndView mv = new ModelAndView(view, "list_", list_);
		return mv;
	}
	@RequestMapping(value="admin/rdel.do")
	public String admin_Delete(@RequestParam("rent_review_no")String rent_review_no) {
		rservice.deleteService(rent_review_no);
		return "redirect:list.do";
	}
	@RequestMapping(value="admin/reviewContent.do")
	public ModelAndView admin_reviewContent(@RequestParam("rent_review_no")String rent_review_no) {
		List<ReviewContent> reviewContentList = rservice.reviewContentService(rent_review_no);
		String view = "admin/reviewContent";
		ModelAndView mv = new ModelAndView(view, "reviewContentList", reviewContentList);
		return mv;
	}
	@RequestMapping(value="board.do")
	public ModelAndView list(@RequestParam(value ="searchValue", required= false)String searchValue){
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
	/*@RequestMapping(value="boardview.do")
	public ModelAndView reviewContent(@RequestParam(value ="branch_no")String branch_no){
		String view = "rentcar/boardview";
		List<BranchName> branchContent = rservice.listServiceAll(branch_no);
		ModelAndView mv = new ModelAndView(view, "branchContent", branchContent);
		return mv;
	}*/
}
