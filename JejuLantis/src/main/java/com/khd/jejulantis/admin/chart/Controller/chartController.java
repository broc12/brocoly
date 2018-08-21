package com.khd.jejulantis.admin.chart.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class chartController {

	@RequestMapping(value="admin/charts.do",method=RequestMethod.GET)
	public String charts() {
		return "admin/charts/charts";
	}
}
