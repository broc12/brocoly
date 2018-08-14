package com.khd.jejulantis.admin.affiliate.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.khd.jejulantis.admin.affiliate.Service.AffiliateService;
import com.khd.jejulantis.model.Affiliate;

@Controller
public class AffiliateController {
	@Autowired
	AffiliateService aservice;
	@RequestMapping(value = "admin/affiliateList.do")
	public ModelAndView affiliateList() {
		String view = "admin/affiliates/affiliateList";
		List<Affiliate> affiliateList = aservice.affiliateListService();
		ModelAndView mv = new ModelAndView(view, "affiliateList", affiliateList);
		return mv;
	}
	@RequestMapping(value = "admin/affiliateContentList.do")
	public ModelAndView affiliateContentList(@RequestParam("affiliate_no")long affiliate_no) {
		String view = "admin/affiliates/affiliateContentList";
		List<Affiliate> affiliateContentList = aservice.affiliateContentListService(affiliate_no);
		ModelAndView mv = new ModelAndView(view, "affiliateContentList", affiliateContentList);
		return mv;
	}
	@RequestMapping(value = "admin/affiliateDelete.do")
	public String affiliateDelete(@RequestParam("affiliate_no")long affiliate_no) {
		aservice.affiliateDeleteService(affiliate_no);
		return "redirect:affiliateList.do";
	}
}
