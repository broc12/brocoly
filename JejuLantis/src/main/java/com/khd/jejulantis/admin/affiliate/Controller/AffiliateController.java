package com.khd.jejulantis.admin.affiliate.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
