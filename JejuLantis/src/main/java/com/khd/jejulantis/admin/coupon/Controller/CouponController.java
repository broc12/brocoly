package com.khd.jejulantis.admin.coupon.Controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.khd.jejulantis.admin.coupon.Service.CouponService;
import com.khd.jejulantis.model.Coupon;

@Controller
public class CouponController {
	
	@Autowired
	private CouponService service;
	
	@RequestMapping(value="admin/coupon.do",method=RequestMethod.GET)
	public String coupon() {
		return "admin/coupons/coupon";
	}
	@RequestMapping(value="admin/couponlist.do",method=RequestMethod.GET)
	public ModelAndView couponlist() {
		List<Coupon>list = service.listService();
		String view = "admin/coupons/couponlist";
		ModelAndView mv = new ModelAndView(view,"list",list);
		return mv;
	}
	@RequestMapping(value="admin/Cpost",method=RequestMethod.GET)
	public String cpost() {
		return "admin/coupons/Cpost";
	}
	@RequestMapping(value="admin/couponadd.do",method=RequestMethod.POST)
	public String insert(Coupon coupon) {
		service.insertService(coupon);
		
		/*//실행시 ???개 쿠폰 생성
		  int couponSize = 20;

		  final char[] possibleCharacters =
		    {'1','2','3','4','5','6','7','8','9','0','A','B','C','D','E','F',
		     'G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V',
		     'W','X','Y','Z'};
		  
		  final int possibleCharacterCount = possibleCharacters.length;
		  String[] arr = new String[couponSize];
		  Random rnd = new Random();
		  int currentIndex = 0;
		  int i = 0;
		  while (currentIndex < couponSize) {
		   StringBuffer buf = new StringBuffer(16);
		   //i는 8자리의 랜덤값을 의미
		   for (i= 16; i > 0; i--) {
		    buf.append(possibleCharacters[rnd.nextInt(possibleCharacterCount)]);
		   }
		   String couponnum = buf.toString();
		   System.out.println("couponnum==>"+couponnum);
		   String pront = couponnum.substring(0, 8);
		   String back = couponnum.substring(8, 16);
		   System.out.println("pront==>"+pront);
		   System.out.println("back==>"+back);
		   arr[currentIndex] = couponnum;
		   currentIndex++;
		  }*/
		return "admin/coupons/Cpost";
	}
	
}
