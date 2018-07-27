package com.khd.admin.PowerController;

import java.util.Locale;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.khd.admin.PowerService.PowerService;
import com.khd.model.PowerModel.Power;


@Controller
public class PowerController {
	@Autowired
	PowerService powerService;
	
	@RequestMapping(value="admin/adminPower.do",method=RequestMethod.GET)
	public String adminPower() {
		return "admin/adminPower";
	}
	@RequestMapping(value="admin/idpost",method=RequestMethod.GET)
	public String idpost() {
		return "admin/idpost";
	}
	
	@RequestMapping(value = "admin/idpost", method = RequestMethod.POST)
	public ModelAndView idpostlist(Power power,@RequestParam(value = "manager_id", required=false) String manager_id){
			
		ModelAndView result = new ModelAndView();
		if(manager_id != ""){
			List<Power>list = powerService.listService(manager_id);
			result.addObject("result", list);
			result.setViewName("admin/idpost");
			return result;
			
		}else{
			result.addObject("nullResult", "검색해주세요.");
			result.setViewName("admin/idpost");
			return result;
		}
	}
	
	@RequestMapping(value="admin/powerUp.do",method=RequestMethod.POST)
	public String update(Power power) {
		powerService.updateService(power);
		return "redirect:adminPower.do";
	}
}
