package com.khd.admin.customerCenter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.khd.ReviewController.ReviewContent;
import com.khd.ReviewController.ReviewService;
import com.khd.notice.Notice;
import com.khd.notice.NoticeService;
import com.khd.customerCenterService.CustomerCenterService;
import com.khd.model.*;

@Controller
public class AdminCustomerController {
	
	@Autowired
	private NoticeService service;
	@Autowired
	private ReviewService rservice;
	@Autowired
	private CustomerCenterService customerService;
	
	
	@RequestMapping(value="admin/tables.do",method=RequestMethod.GET)
	public String tables() {
		return "admin/tables";
	}
	
}
