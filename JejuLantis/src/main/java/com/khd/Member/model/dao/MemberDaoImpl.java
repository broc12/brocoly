package com.khd.Member.model.dao;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.ResultHandler;
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
//		System.out.println("member no"+member.getMember_no());
//		System.out.println("member id"+member.getId());
//		System.out.println("member pwd"+member.getPwd());
//		System.out.println("member name"+member.getName());
//		System.out.println("member birth"+member.getBirth());
//		System.out.println("member sex"+member.getSex());
//		System.out.println("member scls"+member.getSclc());
//		System.out.println("member memlocal"+member.getMember_local());
//		System.out.println("member tel"+member.getTel());
//		System.out.println("member email"+member.getEmail());
//		System.out.println("member resist"+member.getResist_member());
//		
		
		int insert = sql.insert(ns+".memberjoin", member);
		return false;	
	}

	@Override
	public int check(String id) {
		
		int Select = sql.selectOne(ns+".idcheck", id);
		return Select;
	}

	@Override
	public Member mypage(String id) {
		Member select = sql.selectOne(ns+".idview", id);
		return select;
	}

	public Member modify(Member member) {
		//Member update = sql.selectOne(ns+".modify", member);
		int i = sql.update(ns+".modify", member);
		if(i>0) {
			Member update = sql.selectOne(ns+".idview", member);
			return update;
		}else {
			return null;
		}
	}

//	public boolean modify(HashMap<String, String> hm) {
//		int count = sql.selectOne(ns+".modify", hm);
//		return count == 1 ? true : false; 
//	}

//	@Override
//	public int modify(Member member) {
//		int Update = sql.update(ns+".modify", member);
//		return Update;
//	}

	

//	@Override
//	public Member viewMember(String id) {
//		Member Select = sql.selectOne(ns+".viewMember", id);
//		return Select;
//	}

	
	

}
