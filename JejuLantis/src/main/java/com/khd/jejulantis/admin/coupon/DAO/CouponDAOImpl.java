package com.khd.jejulantis.admin.coupon.DAO;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khd.jejulantis.model.Coupon;

@Repository
public class CouponDAOImpl implements CouponDAO{
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String ns = "query.coupon";
	
	@Override
	public void insert(Coupon coupon) {
		sqlSession.insert(ns+".myCouponInsert",coupon);
	}
	@Override
	public List<Coupon>list(){
		List<Coupon>list = sqlSession.selectList(ns+".myCoupon");
		return list;	
	}
}
