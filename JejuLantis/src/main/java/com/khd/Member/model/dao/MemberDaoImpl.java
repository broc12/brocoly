package com.khd.Member.model.dao;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khd.model.Member;
@Repository
public class MemberDaoImpl implements MemberDao {

	@Autowired
	private SqlSession sql;
	private String ns = "query.member";
	
	@Override
	public boolean join(Member member) {
		System.out.println("member no"+member.getMember_no());
		System.out.println("member id"+member.getId());
		System.out.println("member pwd"+member.getPwd());
		System.out.println("member name"+member.getName());
		System.out.println("member birth"+member.getBirth());
		System.out.println("member sex"+member.getSex());
		System.out.println("member scls"+member.getSclc());
		System.out.println("member memlocal"+member.getMember_local());
		System.out.println("member tel"+member.getTel());
		System.out.println("member email"+member.getEmail());
		System.out.println("member resist"+member.getResist_member());
		
		
		int insert = sql.insert(ns+".memberjoin", member);
		return false;	
	}

//	@Override
//	public boolean find(Member member) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean confirm(Member member) {
//		// TODO Auto-generated method stub
//		return false;
//	}

}
