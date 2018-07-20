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
	public int idcheck(String id) {
		return memberDao.check(id);
	}
//	@Override
//	public int modify(Member member) {
//		return memberDao.modify(member);
//	}
//	

	@Override
	public Member mypageService(String id) {
		// TODO Auto-generated method stub
		return memberDao.mypage(id);	 
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
	public int deleteService(String id) {
		// TODO Auto-generated method stub
		return memberDao.delete(id);
	}
	
	// 아이디 찾기
	@Override
	public String find_id(String email) throws Exception {
		return memberDao.find_id(email);	
	}
	// 비밀번호 찾기
		@Override
		public String find_pwd(String id) throws Exception {
			return memberDao.find_pwd(id);	
		}
		@Override
		public int emailcheck(String email) {
			return memberDao.echeck(email);
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