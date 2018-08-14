package com.khd.jejulantis.client.rentcar.Controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.khd.jejulantis.client.Reserv.DAO.ReservDAO;
import com.khd.jejulantis.client.Reserv.Service.ReservService;
import com.khd.jejulantis.client.coupon.Service.DetailService;
import com.khd.jejulantis.client.payment.Service.PaymentService;
import com.khd.jejulantis.client.rentcar.Service.RentcarService;
import com.khd.jejulantis.model.Detail;
import com.khd.jejulantis.model.Member;
import com.khd.jejulantis.model.Payment;
import com.khd.jejulantis.model.Rcar;
import com.khd.jejulantis.model.Reserv;
import com.khd.jejulantis.model.SearchRequirements;
import com.khd.jejulantis.model.SelectRentcar;

@Controller
public class RentcarController {
	
	@Autowired
	RentcarService rentcarservice;
	@Autowired
	DetailService detailservice;
	@Autowired
	PaymentService paymentService;
	@Autowired
	ReservService reservService;

	/*@Autowired
	ReservDAO reservdao;*/
	
	@RequestMapping(value="car.do",method=RequestMethod.GET)
	public ModelAndView car(HttpServletRequest request,@RequestParam(value="sort",required=false) String sort) {
		ModelAndView mv = new ModelAndView("rentcar/rentcars/car");
		SearchRequirements requirements = new SearchRequirements(rentcarservice.timeStampService(),sort);
		List<Rcar> list = rentcarservice.rentcarListService(requirements);
		mv.addObject("list", list);
		mv.addObject("requirements", requirements);
		return mv;
	}
	
	@RequestMapping(value="car.do",method=RequestMethod.POST)
	public String car(HttpServletRequest request,@RequestParam("Checkouttime")String checkouttime,@RequestParam("Checkoutdate")String checkoutdate,@RequestParam("Checkintime")String checkintime,@RequestParam("Checkindate")String checkindate,@RequestParam("car_name")String car_name) {
		SearchRequirements requirements = new SearchRequirements(checkindate,checkintime,checkoutdate,checkouttime,car_name);
		requirements.checkTime(rentcarservice.currenttimeStampService());
		if(!requirements.isErrorFlag()) {
			List<Rcar> list = rentcarservice.rentcarListService(requirements);
			request.setAttribute("list", list);
		}
		request.setAttribute("requirements", requirements);
		return "rentcar/rentcars/car";
	}
	
	@RequestMapping(value="rentcar.do",method=RequestMethod.POST)
	public ModelAndView rentcar(SearchRequirements requirements) {
		ModelAndView mv = new ModelAndView("rentcar/rentcars/rentcar");
		SelectRentcar car = rentcarservice.confirmrentcarService(requirements);
		if(car == null) {
			requirements.setErrorMsg("사용 가능한 차량이 없습니다.");
		}else {
			mv.addObject("rentcar", car);
		}
		requirements.setSearchFlag(true);
		mv.addObject("requirements", requirements);
		return mv;
	}
	@RequestMapping(value="searchcar.do",method=RequestMethod.GET)
	public @ResponseBody List<Rcar> searchcar(@RequestParam(value="checkListmanu[]",required=false) List<String> checkListmanu,@RequestParam(value="checkListfuel[]",required=false) List<String> checkListfuel,@RequestParam(value="checkListtype[]",required=false) List<String> checkListtype,@RequestParam(value="checkListoption[]",required=false) List<String> checkListoption,@RequestParam(value="checkindate",required=false) String checkindate,@RequestParam(value="checkoutdate",required=false) String checkoutdate,@RequestParam(value="car_name",required=false) String car_name) {
		SearchRequirements requirements = new SearchRequirements(checkindate,checkoutdate,car_name,checkListmanu,checkListfuel,checkListtype,checkListoption);
		List<Rcar> list = rentcarservice.rentcarListService(requirements);
		return list;
	}
	@RequestMapping(value="currenttime.do",method=RequestMethod.GET)
	public @ResponseBody Date currenttime() {
		Date currentDate = rentcarservice.currenttimeStampService();
		return currentDate;
	}

	@RequestMapping(value="input.do",method=RequestMethod.POST)
	public ModelAndView input(SearchRequirements requirements,HttpSession session,Reserv reserv) {
		Member log = (Member)session.getAttribute("log");
		List<Detail>list = detailservice.listService(log.getMember_id());
		String view = "rentcar/rentcars/input";
		ModelAndView mv = new ModelAndView(view,"list",list);
		SelectRentcar car = rentcarservice.confirmrentcarService(requirements);
		if(car == null) {
			requirements.setErrorMsg("사용 가능한 차량이 없습니다.");
		}else {
			mv.addObject("rentcar", car);
		}
		requirements.setSearchFlag(true);
		mv.addObject("requirements", requirements);
		mv.addObject("reserv", reserv);
		return mv;
	}

	@RequestMapping(value="payment.do",method=RequestMethod.POST)
	public ModelAndView payment(Payment payment,Reserv reserv) {
		System.out.println("################");
		Payment pay = paymentService.insertService(payment);
		reserv.setRent_payment_no(pay.getRent_payment_no());
		Reserv res = reservService.insertService(reserv);
		String view = "rentcar/rentcars/end";
		ModelAndView mv = new ModelAndView(view,"res",res);
		return mv;
	}

	@RequestMapping(value="check.do",method=RequestMethod.GET)
	public ModelAndView check(@RequestParam("member_no")long member_no) {
		List<Reserv>list = reservService.listService(member_no);
		String view = "rentcar/reservations/check";
		ModelAndView mv = new ModelAndView(view,"list",list);
		return mv;
	}
}
