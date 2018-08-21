package com.khd.jejulantis.admin.chart.Controller;

import java.io.IOException;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.khd.jejulantis.admin.chart.Service.ChartService;

@Controller
public class ChartController {
	@Autowired
	private ChartService service;
	
	@RequestMapping(value="admin/charts.do",method=RequestMethod.GET)
	public ModelAndView charts(@RequestParam("branch_no")long branch_no) throws IOException{
		
		ObjectMapper obj = new ObjectMapper();
		HashMap map = service.finishService(branch_no);
		String es = obj.writeValueAsString(map);
		String view = "admin/charts/charts";
		ModelAndView mv = new ModelAndView(view,"map",es);
		return mv;
	}
}
