package com.khd.Member.model.service;

import com.khd.model.Member;

public interface MemberService {

	boolean joinService(Member member);
	boolean findService(Member member);
	boolean confirmService(Member member);
}
