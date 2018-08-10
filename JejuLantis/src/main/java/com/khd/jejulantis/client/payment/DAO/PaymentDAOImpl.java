package com.khd.jejulantis.client.payment.DAO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khd.jejulantis.model.Payment;

@Repository
public class PaymentDAOImpl implements PaymentDAO{
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String ns = "query.payment";
	
	@Override
	public Payment insert(Payment payment) {
		sqlSession.insert(ns+".myInsert",payment);
		return payment;
	}
}
