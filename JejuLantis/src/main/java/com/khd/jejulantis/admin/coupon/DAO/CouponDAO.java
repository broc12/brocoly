package com.khd.jejulantis.admin.coupon.DAO;

import java.util.List;

import com.khd.jejulantis.model.Coupon;

public interface CouponDAO {
	void insert(Coupon coupon);
	List<Coupon>list();
}
