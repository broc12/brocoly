package com.khd.Member.model.dao;


import com.khd.model.Member;

public interface MemberDao {

	boolean join(Member member);
	boolean find(Member member);
	boolean confirm(Member member);
}
