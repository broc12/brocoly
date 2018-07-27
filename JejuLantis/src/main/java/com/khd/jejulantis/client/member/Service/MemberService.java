package com.khd.jejulantis.client.member.Service;

import java.util.HashMap;

import javax.servlet.http.HttpServletResponse;

import com.khd.jejulantis.model.Member;

public interface MemberService {

	boolean joinService(Member member);
//	boolean findService(Member member);
//	boolean confirmService(Member member);
	int idcheck(String member_id);
	Member mypageService(String member_id);
	Member modifyService(Member member);
	int deleteService(String member_id);
//	int deletemodify(String id);
	String find_id( String member_email) throws Exception;
	String find_pwd( String member_id) throws Exception;
	int emailcheck(String member_email);
	
//	boolean modifyService(HashMap<String, String> hm);
	
//	int modify(Member member);
//	Member viewMember(String id);
}
