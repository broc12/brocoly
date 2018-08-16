package com.khd.jejulantis.admin.reserv.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.khd.jejulantis.admin.reserv.Service.MyReservService;
import com.khd.jejulantis.model.CarInfo;
import com.khd.jejulantis.model.CarkindDetail;
import com.khd.jejulantis.model.Manager;
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
	public ModelAndView reservfull(@RequestParam("rent_reserv_no")long rent_reserv_no,HttpSession session) {
		Manager log = (Manager)session.getAttribute("managerlog");
		List<CarInfo>info = service.infoService(log.getBranch_no());
		List<CarkindDetail>kind = service.kindService();
		Reserv res = service.reservfullService(rent_reserv_no);
		String view = "admin/reservs/reservfull";
		ModelAndView mv = new ModelAndView(view,"res",res);
		mv.addObject("info", info);
		mv.addObject("kind", kind);
		return mv;
	}
	
	@RequestMapping(value="admin/myCarNo.do",method= {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public List myCarNo(@RequestParam("no")long car_no) {
		List<CarInfo>list = service.myCarNoService(car_no);
		return list;
	}
	
	@RequestMapping(value="admin/reservUpdate.do",method=RequestMethod.POST)
	public String update(Reserv reserv,RedirectAttributes redirectAttributes, @RequestParam("rent_reserv_driver_addr_detail")String rent_reserv_driver_addr_detail) {
		System.out.println("erererere");
		if(rent_reserv_driver_addr_detail != null) {
			reserv.setRent_reserv_driver_addr(reserv.getRent_reserv_driver_addr()+" "+rent_reserv_driver_addr_detail);
			service.updateService(reserv);
		}else {
			service.updateService(reserv);
		}
		System.out.println("확인 : " + reserv.getRent_reserv_driver_addr());
		redirectAttributes.addAttribute("branch_no", reserv.getBranch_no());
		return "redirect:reserv.do";
	}
}
