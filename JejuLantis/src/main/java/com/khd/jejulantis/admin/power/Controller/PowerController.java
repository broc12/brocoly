package com.khd.jejulantis.admin.power.Controller;

import java.util.Locale;

import javax.servlet.http.HttpSession;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.khd.jejulantis.admin.power.Service.PowerService;
import com.khd.jejulantis.model.Manager;
import com.khd.jejulantis.model.Power;


@Controller
public class PowerController {
	@Autowired
	PowerService powerService;
	
	@RequestMapping(value="admin/adminPower.do",method=RequestMethod.GET)
	public String adminPower(HttpSession session) {
		Manager log = (Manager)session.getAttribute("managerlog");
		String view = "";
		System.out.println("확인 : " + log.getBranch_no());
		if(log.getBranch_no()==1) {
			view = "admin/adminPowers/adminPower";
		}else {
			view = "admin/adminPowers/adminBranchPower";
		}
		return view;
	}
	@RequestMapping(value="admin/idpost",method=RequestMethod.GET)
	public String idpost() {
		return "admin/adminPowers/idpost";
	}
	
	@RequestMapping(value = "admin/idpost", method = RequestMethod.POST)
	public ModelAndView idpostlist(Power power,@RequestParam(value = "manager_id", required=false) String manager_id, HttpSession session){
		Manager log = (Manager)session.getAttribute("managerlog");
		long branch_no = log.getBranch_no();
		ModelAndView result = new ModelAndView();
		if(manager_id != ""){
			if(branch_no == 1) {
				List<Power>list = powerService.listService(manager_id);
				result.addObject("result", list);
				result.setViewName("admin/adminPowers/idpost");
			}else {
				List<Power>list = powerService.listService(manager_id, branch_no);
				result.addObject("result", list);
				result.setViewName("admin/adminPowers/idpost");
			}
			
		}else{
			result.addObject("nullResult", "검색해주세요.");
			result.setViewName("admin/adminPowers/idpost");
			
		}
		return result;
	}
	
	@RequestMapping(value="admin/powerUp.do",method=RequestMethod.POST)
	public String update(Power power) {
		powerService.updateService(power);
		return "redirect:adminPower.do";
	}
}
