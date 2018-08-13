package com.khd.jejulantis.client.snsLogin.Dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khd.jejulantis.model.CarInfo;
import com.khd.jejulantis.model.CarInfoInsert;
import com.khd.jejulantis.model.CarInfoSelect;
import com.khd.jejulantis.model.Member;

@Repository
public class NaverLoginDaoImpl implements NaverLoginDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String ns = "query.member";

	@Override
	public Member checkMember(String id) {
		Member member = sqlSession.selectOne(ns+".checkMember",id);
		if(member!=null) return member;
		else return null;
	}
	@Override
	public boolean joinMember(Member memberToJoin) {
		int i = sqlSession.insert(ns+".joinSns",memberToJoin);
		boolean isInserted;
		if(i>0) isInserted=true;
		else isInserted=false;
		return isInserted;
	}
}
