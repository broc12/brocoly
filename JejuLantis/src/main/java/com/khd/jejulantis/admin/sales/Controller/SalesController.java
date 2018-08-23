package com.khd.jejulantis.admin.sales.Controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.khd.jejulantis.admin.sales.service.SalesService;
import com.khd.jejulantis.model.Sales;


@Controller
public class SalesController {
	@Autowired
	private SalesService salesService;
	
	@RequestMapping(value="admin/sales.do", method=RequestMethod.GET)
	public ModelAndView sales(@RequestParam("branch_no") long branch_no) {
		String view ="admin/sales/sales";
		
		ModelAndView mv = new ModelAndView(view,"branch_no",branch_no);
		return mv;
	}
	@ResponseBody
	@RequestMapping(value="admin/salesList.do", method=RequestMethod.GET)
	public List<Sales> paymentCancle(@RequestParam("start_date") String start_date, 
			@RequestParam("end_date") String end_date,@RequestParam("branch_no") long branch_no) {
		System.out.println("start_date"+ start_date);
		
	HashMap<String, Object> hash = new HashMap<String, Object>();
		hash.put("start_date", start_date); 
		hash.put("end_date", end_date);
		hash.put("branch_no", branch_no);
	
	List<Sales> list= salesService.totalSales(hash);
	for(int i = 0; i<list.size();i++) {
		System.out.println(list.get(i).getSalesDate());
	}
	return list;
	
	}
	@ResponseBody
	@RequestMapping(value="admin/checkDate.do", method=RequestMethod.GET)
	public boolean checkDate(@RequestParam("start_date") Date start_date, 
			@RequestParam("end_date") Date end_date) {
		boolean isRight;
		if(end_date.after(start_date)) {
			isRight = true;
			System.out.println("isRight "+isRight);
			return isRight;
		}
		else {
			isRight = false;
			System.out.println("isRight "+isRight);
			return isRight;
		}
	}
}
