package com.khd.jejulantis.client.coupon.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CouponController {
	
	@RequestMapping(value="admin/coupon.do",method=RequestMethod.GET)
	public String coupon() {
		return "admin/coupons/coupon";
	}
}
