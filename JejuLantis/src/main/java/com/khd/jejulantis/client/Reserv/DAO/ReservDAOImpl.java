package com.khd.jejulantis.client.Reserv.DAO;

import java.util.List;

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
	public Reserv insert(Reserv reserv) {
		sqlSession.insert(ns+".myInsert",reserv);
		long reserv_no = reserv.getRent_reserv_no();
		Reserv res = sqlSession.selectOne(ns+".myReserv",reserv_no);
		return res;
	}
	@Override
	public List<Reserv>list(long member_no){
		List<Reserv>list = sqlSession.selectList(ns+".myCheck",member_no);
		return list;
	}
}
