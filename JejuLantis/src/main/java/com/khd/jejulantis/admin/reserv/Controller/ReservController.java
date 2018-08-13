package com.khd.jejulantis.admin.reserv.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.khd.jejulantis.admin.reserv.Service.MyReservService;
import com.khd.jejulantis.model.Reserv;

@Controller
public class ReservController {
	
	@Autowired
	private MyReservService service;
	
	@RequestMapping(value="admin/reserv.do",method=RequestMethod.GET)
	public ModelAndView reserv(@RequestParam("branch_no")long branch_no) {
		List<Reserv>list = service.listService(branch_no);
		String view = "admin/reservs/reserv";
		ModelAndView mv = new ModelAndView(view,"list",list);
		return mv;
	}
	
	@RequestMapping(value="admin/reservfull.do",method=RequestMethod.GET)
	public ModelAndView reservfull(@RequestParam("rent_reserv_no")long rent_reserv_no) {
		Reserv res = service.reservfullService(rent_reserv_no);
		String view = "admin/reservs/reservfull";
		ModelAndView mv = new ModelAndView(view,"res",res);
		return mv;
	}
}
