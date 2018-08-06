package com.khd.jejulantis.admin.coupon.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.jejulantis.admin.coupon.DAO.CouponDAO;
import com.khd.jejulantis.model.Coupon;

@Service
public class CouponServiceImpl implements CouponService{
	@Autowired
	private CouponDAO couponDAO;
	
	@Override
	public void insertService(Coupon coupon) {
		couponDAO.insert(coupon);
	}
	
	@Override
	public List<Coupon>listService(){
		return couponDAO.list();
	}
}
