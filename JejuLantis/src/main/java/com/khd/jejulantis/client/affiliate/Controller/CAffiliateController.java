package com.khd.jejulantis.client.affiliate.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.khd.jejulantis.client.affiliate.Service.CAffiliateService;
import com.khd.jejulantis.model.Affiliate;

@Controller
public class CAffiliateController {
	@Autowired
	CAffiliateService caservice;
	@RequestMapping(value = "affiliate.do")
	public String affiliateForm() {
		return "rentcar/affiliates/affiliate";
	}
	@RequestMapping(value = "affiliateWrite.do", method=RequestMethod.POST)
	public String affiliateWrite(@RequestParam("affiliate_branch_name")String affiliate_branch_name,
			@RequestParam("affiliate_member_name")String affiliate_member_name,
			@RequestParam("affiliate_member_email")String affiliate_member_email,
			@RequestParam("affiliate_member_tel")long affiliate_member_tel,
			@RequestParam("affiliate_title")String affiliate_title,
			@RequestParam("affiliate_content")String affiliate_content) {
		Affiliate affiliate = new Affiliate(0, affiliate_branch_name, affiliate_member_name, affiliate_member_email,
				affiliate_member_tel, affiliate_title, affiliate_content, null);
		caservice.insertService(affiliate);
		return "redirect:affiliate.do";
	}
}
