package com.khd.jejulantis.client.affiliate.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.khd.jejulantis.client.affiliate.Service.CAffiliateService;

@Controller
public class CAffiliateController {
	@Autowired
	CAffiliateService caservice;
	@RequestMapping(value = "affiliate.do")
	public String affiliateForm() {
		return "rentcar/affiliates/affiliate";
	}
	@RequestMapping(value = "affiliateWrite.do")
	public String affiliateWrite() {
		
		return "redirect:affilate.do";
	}
}
