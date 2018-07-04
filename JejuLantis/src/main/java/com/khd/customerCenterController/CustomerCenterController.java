package com.khd.customerCenterController;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.khd.customerCenterService.CustomerCenterService;
import com.khd.model.CustomerCenter;

/**
 * Handles requests for the application home page.
 */
@Controller
public class CustomerCenterController {
	
	@Autowired 
	private CustomerCenterService service;
	
	@RequestMapping(value="service.do",method=RequestMethod.GET)
	public ModelAndView list(@RequestParam(value="strInput",required=false) String strInput) {
		//System.out.println(input);
		//if(input == 0) input=1;
		int input;
		if (strInput==null) {
		input = 1;
		}else input =Integer.parseInt(strInput);
		long totalNum = service.totalNum();
		System.out.println("1¹øÂ°"+totalNum);
		int showList = 5;
		int betweenA = ((input-1)*showList)+1;
		int betweenB = showList*input;	
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", betweenA);
		map.put("B", betweenB);
		System.out.println("A"+betweenA);
		System.out.println("B"+betweenB);
		long totalPage = 0;
			if(totalNum%showList!=0){
				totalPage = (totalNum/showList)+1;
			}else {
				totalPage =(totalNum/showList);
			}

		List<CustomerCenter> list = service.list(map);
		System.out.println(totalNum);
		System.out.println(list.size());
		String view = "rentcar/service";
		ModelAndView mv = new ModelAndView(view,"list",list);
		mv.addObject("totalPage", totalPage);
		return mv;
	}
	
}