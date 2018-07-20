package com.khd.admin.carInfo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.khd.ReviewController.ReviewContent;
import com.khd.ReviewController.ReviewService;
import com.khd.notice.Notice;
import com.khd.notice.NoticeService;
import com.khd.util.UtilFile;
import com.khd.customerCenterService.CustomerCenterService;
import com.khd.model.Qna;

@Controller
public class CarInfoController {
	@Autowired
	private CustomerCenterService customerService;
	
	@RequestMapping(value="admin/carInfo.do",method=RequestMethod.GET)
	public String carInfo() {
		
		return "admin/carInfo";
		
	}
	@RequestMapping(value="admin/carInfoUpload.do",method=RequestMethod.GET)
	public String carInfoUpload() {
		
		return "admin/carInfoUpload";
		
	}
	
}




