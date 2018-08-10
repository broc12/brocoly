package com.khd.jejulantis.client.Reserv.DAO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khd.jejulantis.model.Reserv;

@Repository
public class ReservDAOImpl implements ReservDAO{
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String ns = "query.reserv";
	
	@Override
	public void insert(Reserv reserv) {
		sqlSession.insert(ns+".myInsert",reserv);
	}
}
