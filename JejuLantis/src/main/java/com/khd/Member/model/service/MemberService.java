package com.khd.Member.model.service;

import java.util.HashMap;

import javax.servlet.http.HttpServletResponse;

import com.khd.model.Member;

public interface MemberService {

	boolean joinService(Member member);
//	boolean findService(Member member);
//	boolean confirmService(Member member);
	int idcheck(String id);
	Member mypageService(String id);
	Member modifyService(Member member);
	int deleteService(String id);
//	int deletemodify(String id);
	String find_id( String email) throws Exception;
	String find_pwd( String id) throws Exception;
	int emailcheck(String email);
	
//	boolean modifyService(HashMap<String, String> hm);
	
//	int modify(Member member);
//	Member viewMember(String id);
}
