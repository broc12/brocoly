package com.khd.jejulantis.admin.sales.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.khd.jejulantis.admin.sales.service.SalesService;


@Controller
public class SalesController {
	@Autowired
	private SalesService service;
	
	@RequestMapping(value="sales.do", method=RequestMethod.GET)
	public void sales(@RequestParam("branch_no") long branch_no) {
		/*salesService.totalSales(branch_no);*/
		
	}
}
