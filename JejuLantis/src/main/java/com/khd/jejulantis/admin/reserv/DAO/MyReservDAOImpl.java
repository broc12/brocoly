package com.khd.jejulantis.admin.reserv.DAO;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khd.jejulantis.model.Reserv;

@Repository
public class MyReservDAOImpl implements MyReservDAO{
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String ns = "query.reserv";
	
	@Override
	public List<Reserv>list(long branch_no){
		List<Reserv>list = sqlSession.selectList(ns+".myBranch",branch_no);
		return list;
	}
}
