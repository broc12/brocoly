package com.khd.jejulantis.client.paymentCancle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.khd.jejulantis.client.paymentCancle.service.PaymentCancleService;


@Controller
public class PaymentCancleController {
	@Autowired
	private PaymentCancleService service;
	
	@RequestMapping(value="paymentCancle.do", method=RequestMethod.GET)
	public void paymentCancle(@RequestParam("rent_reserv_no") long rent_reserv_no, @RequestParam("rent_payment_no") long rent_payment_no) {
		System.out.println("rent_reserv_no "+ rent_reserv_no );
		System.out.println("rent_payment_no "+ rent_payment_no );
		long refundPrice = service.cancleReserve(rent_reserv_no,rent_payment_no);
		System.out.println("후 됐군.." + refundPrice);
	}
}
