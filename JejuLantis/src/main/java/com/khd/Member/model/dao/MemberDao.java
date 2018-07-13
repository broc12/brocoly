package com.khd.Member.model.dao;


import com.khd.model.Member;

public interface MemberDao {

	boolean join(Member member);
//	boolean find(Member member);
//	boolean confirm(Member member);

		int check(String id);
//	 public int modify(Member member);
		Member mypage(String id);
		Member modify(Member member);
//	Member viewMember(String id);
	
}
