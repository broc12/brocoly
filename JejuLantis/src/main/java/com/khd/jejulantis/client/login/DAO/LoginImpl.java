package com.khd.jejulantis.client.login.DAO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.khd.jejulantis.model.Member;

@Repository
public class LoginImpl implements LoginDAO {
	
	@Autowired
	private SqlSession sql;
	private String ns = "query.member";
	

@Override
public Member loginCheck(Member member) {
	Member Select = sql.selectOne(ns+".loginCheck", member);
	return Select;
}
}
