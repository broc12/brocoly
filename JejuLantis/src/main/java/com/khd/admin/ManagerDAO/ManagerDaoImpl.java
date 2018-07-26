package com.khd.admin.ManagerDAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.khd.admin.ManagerModel.Manager;
import com.khd.branch.Branch;
	
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

	@Override
	public List<Branch> post(String branch) {
		System.out.println("가나다"+branch);
		List<Branch> Select = sql.selectList(ns+".branchcheck", branch);
		System.out.println("1241다"+Select.size());
		return Select;
	}

	@Override
	public int idcheck(String manager_id) {
		int Select = sql.selectOne(ns+".idcheck", manager_id);
		return Select;
	}

	@Override
	public int emailcheck(String manager_email) {
		int Select = sql.selectOne(ns+".emailcheck", manager_email);
		return Select;
	}

	@Override
	public boolean loginCheck(Manager manager) {
		int count = Integer.parseInt(sql.selectOne("managerloginCheck",manager).toString()),
				totalCount = sql.selectOne("managertotalAccount");
		if(totalCount > 0) {
			if(count > 0) {
				return true;
			}else
				return false;
		}
		return false;
	}

}
