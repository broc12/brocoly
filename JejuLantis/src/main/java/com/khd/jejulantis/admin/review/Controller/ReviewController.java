package com.khd.jejulantis.admin.review.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.khd.jejulantis.admin.review.Service.ReviewService;
import com.khd.jejulantis.model.BranchName;
import com.khd.jejulantis.model.ReviewContent;

@Controller
public class ReviewController {
	
	@Autowired
	private ReviewService rservice;
	
	@RequestMapping(value="admin/list.do")
	public ModelAndView list(@RequestParam("manager_id")String manager_id) {
		List<ReviewContent> reviewList = rservice.listServiceAll(manager_id);
		String view = "admin/list";
		ModelAndView mv = new ModelAndView(view, "reviewList", reviewList);
		return mv;
	}
	@RequestMapping(value="admin/reviewDel.do")
	public String admin_Delete(@RequestParam("manager_id")String manager_id,
		@RequestParam("rent_review_no")String rent_review_no) {
		rservice.deleteService(rent_review_no);
		return "redirect:list.do?manager_id="+manager_id;
	}
	@RequestMapping(value="admin/reviewContent.do")
	public ModelAndView admin_reviewContent(@RequestParam("rent_review_no")String rent_review_no) {
		List<ReviewContent> reviewContentList = rservice.reviewContentService(rent_review_no);
		String view = "admin/reviewContent";
		ModelAndView mv = new ModelAndView(view, "reviewContentList", reviewContentList);
		return mv;
		//return "admin/reviewContent";
	}

}
