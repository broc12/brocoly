package com.khd.loginDAO;

import com.khd.model.LoginInfo;
import com.khd.model.Member;

public interface LoginDAO {
	public boolean loginCheck(Member member);
}
