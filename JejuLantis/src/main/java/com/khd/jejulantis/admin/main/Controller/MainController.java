package com.khd.jejulantis.admin.main.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.khd.jejulantis.admin.car.Service.CarService;
import com.khd.jejulantis.model.Car;

@Controller
public class MainController {
	
	@Autowired
	private CarService service;
	
	@RequestMapping(value="admin/bestseller.do",method=RequestMethod.GET)
	public ModelAndView bestseller() {
		List<Car>list = service.listService();
		String view = "admin/bestseller/bestseller";
		ModelAndView mv = new ModelAndView(view,"list",list);
		return mv;
	}
	
	@RequestMapping(value="admin/best.do",method=RequestMethod.POST)
	public String best(@RequestParam(value="bestYn",required=false)List<Long>best) {
		service.bestService(best);
		return "redirect:bestseller.do";
	}	
}
