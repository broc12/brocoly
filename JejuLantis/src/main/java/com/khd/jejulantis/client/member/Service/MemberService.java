package com.khd.jejulantis.client.member.Service;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;

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
	List<Member> memberListService();
//	boolean modifyService(HashMap<String, String> hm);
	Member memgetUsersByID(String member_id);
	Member securityloginCheck(Member member);
	void changePwd(Member member);
	void find_pw(HttpServletResponse response, Member member, String member_id, String member_email, Model md)
			throws IOException;
//	int modify(Member member);
//	Member viewMember(String id);
	List<Member>newListService();
}
