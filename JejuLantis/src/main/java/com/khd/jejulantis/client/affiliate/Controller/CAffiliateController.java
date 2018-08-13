package com.khd.jejulantis.client.affiliate.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CAffiliateController {
	
	@RequestMapping(value = "affiliate.do")
	public String affiliateForm() {
		return "rentcar/affiliates/affiliate";
	}
	@RequestMapping(value = "affiliateWrite.do")
	public String affiliateWrite() {
		
		return "redirect:affilate.do";
	}
}
