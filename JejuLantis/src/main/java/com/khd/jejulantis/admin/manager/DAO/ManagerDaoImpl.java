package com.khd.jejulantis.admin.manager.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khd.jejulantis.model.Branch;
import com.khd.jejulantis.model.Manager;
import com.khd.jejulantis.model.Member;
	
@Repository
public class ManagerDaoImpl implements ManagerDao{
	
	@Autowired
	private SqlSession sql;
	private String ns = "query.Manager";
	
	@Override
	public boolean join(Manager manager) {
		
		int insert = sql.insert(ns+".managerresist", manager);
		System.out.println("branchname"+ manager.getBranch_no());
		return false;
	}

	@Override
	public List<Branch> post(String branch) {
		
		List<Branch> Select = sql.selectList(ns+".branchcheck", branch);
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
	public Manager loginCheck(Manager manager) {
		Manager Select = sql.selectOne(ns+".managerloginCheck", manager);
		return Select;
	}

	@Override
	public Manager mypage(String manager_id) {
		Manager select = sql.selectOne(ns+".idview", manager_id);
		
		return select;
	}

	@Override
	public Manager modify(Manager manager) {
				int i = sql.update(ns+".modify", manager);
				if(i>0) {
					Manager update = sql.selectOne(ns+".idview", manager);
					return update;
				}else {
					return null;
				}
			}

}
