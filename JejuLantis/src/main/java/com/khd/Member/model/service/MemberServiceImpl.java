package com.khd.Member.model.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.Member.model.dao.MemberDao;
import com.khd.model.Member;
@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDao memberDao;
	@Override
	public boolean joinService(Member member) {
		return memberDao.join(member);
	}
	@Override
	public int idcheck(String id) {
		return memberDao.check(id);
	}

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