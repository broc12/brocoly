package com.khd.Member.model.service;


import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.Member.model.dao.MemberDaoImpl;
import com.khd.model.Member;
@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDaoImpl memberDao = new MemberDaoImpl();
	
	@Override
	public boolean joinService(Member member) {
		return memberDao.join(member);
	}
	@Override
	public int idcheck(String member_id) {
		return memberDao.check(member_id);
	}
//	@Override
//	public int modify(Member member) {
//		return memberDao.modify(member);
//	}
//	

	@Override
	public Member mypageService(String member_id) {
		// TODO Auto-generated method stub
		return memberDao.mypage(member_id);	 
	}
//	@Override
//	public boolean modifyService(HashMap<String, String> hm) {
//		// TODO Auto-generated method stub
//		return memberDao.modify(hm);
//	}
//	
	@Override
	public Member modifyService(Member member) {
	
		return memberDao.modify(member);
	}
//	@Override
//	public Member deleteService(Member member) {
//		return memberDao.delete(member);
//	}
	@Override
	public int deleteService(String member_id) {
		// TODO Auto-generated method stub
		return memberDao.delete(member_id);
	}
	
	// 아이디 찾기
	@Override
	public String find_id(String member_email) throws Exception {
		return memberDao.find_id(member_email);	
	}
	// 비밀번호 찾기
		@Override
		public String find_pwd(String member_id) throws Exception {
			return memberDao.find_pwd(member_id);	
		}
		@Override
		public int emailcheck(String member_email) {
			return memberDao.echeck(member_email);
		}
	
//	@Override
//	public int deletemodify(String id) {
//		// TODO Auto-generated method stub
//		return memberDao.delete(id);
//	}
	

//	@Override
//	public boolean findService(Member member) {
//		return memberDao.find(member);
//	}
//
//	@Override
//	public boolean confirmService(Member member) {
//		return memberDao.confirm(member);
//	}
}