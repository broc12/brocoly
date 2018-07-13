package com.khd.Member.model.service;

import java.util.HashMap;

import com.khd.model.Member;

public interface MemberService {

	boolean joinService(Member member);
//	boolean findService(Member member);
//	boolean confirmService(Member member);
	int idcheck(String id);
	Member mypageService(String id);
	Member modifyService(Member member);
	
//	boolean modifyService(HashMap<String, String> hm);
	
//	int modify(Member member);
//	Member viewMember(String id);
}
