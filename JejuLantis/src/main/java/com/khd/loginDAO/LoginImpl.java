package com.khd.loginDAO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khd.model.LoginInfo;

@Repository
public class LoginImpl implements LoginDAO {
	
	@Autowired
	private SqlSession sql;
	
	@Override
	public boolean loginCheck(LoginInfo loginInfo) {
		int count = Integer.parseInt(sql.selectOne("loginCheck",loginInfo).toString()),
				totalCount = sql.selectOne("totalAccount");
		if(totalCount > 0) {
			if(count > 0) {
				return true;
			}else
				return false;
		}
		return false;
	}

}
