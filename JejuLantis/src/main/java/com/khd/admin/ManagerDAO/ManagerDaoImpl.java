package com.khd.admin.ManagerDAO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.khd.admin.ManagerModel.Manager;
	
@Repository
public class ManagerDaoImpl implements ManagerDao{
	
	@Autowired
	private SqlSession sql;
	private String ns = "query.Manager";
	
	@Override
	public boolean join(Manager manager) {
		
		int insert = sql.insert(ns+".managerresist", manager);
		return false;
	}

}
