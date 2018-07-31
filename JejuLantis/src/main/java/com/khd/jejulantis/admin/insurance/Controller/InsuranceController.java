package com.khd.jejulantis.admin.insurance.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InsuranceController {
	//@Autowired
	//private InsuranceService iservice;
	@RequestMapping(value="admin/InsuranceList")
	public String insuranceList() {
		return "admin/insurances/insuranceList";
	}
	@RequestMapping(value="admin/InsuranceContent")
	public String insuranceContent() {
		return "admin/insurances/insuranceContent";
	}
	@RequestMapping(value="admin/InsuranceUpdate")
	public String insuranceUpdate() {
		return "admin/insurances/insuranceUpdate";
	}
	@RequestMapping(value="admin/InsuranceDelete")
	public String insuranceDelete() {
		return "admin/insurances/insuranceDelete";
	}
}
