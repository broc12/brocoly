package com.khd.Member.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khd.model.Member;
@Repository
public class MemberDaoImpl implements MemberDao {

	@Autowired
	SqlSessionTemplate sqlsession;
	@Override
	public boolean join(Member member) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean find(Member member) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean confirm(Member member) {
		// TODO Auto-generated method stub
		return false;
	}

}
