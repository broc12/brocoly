package com.khd.jejulantis.admin.insurance.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.khd.jejulantis.admin.insurance.Service.InsuranceService;
import com.khd.jejulantis.model.Insurance;

@Controller
public class InsuranceController {
	@Autowired
	private InsuranceService iservice;
	@RequestMapping(value="admin/insuranceList.do")
	public String insuranceList() {
		//List<Insurance> insuranceList = iservice
		String view = "admin/insurances/insuranceList";
		//ModelAndView mv = ModelAndView(view, "insuranceList", insuranceList);
		//return mv;
		return "admin/insurances/insuranceList";
	}
	@RequestMapping(value="admin/insuranceContent.do")
	public String insuranceContent() {
		return "admin/insurances/insuranceContent";
	}
	@RequestMapping(value="admin/insuranceUpdate.do")
	public String insuranceUpdate() {
		return "admin/insurances/insuranceUpdate";
	}
	@RequestMapping(value="admin/insuranceDelete.do")
	public String insuranceDelete() {
		return "admin/insurances/insuranceDelete";
	}
}
