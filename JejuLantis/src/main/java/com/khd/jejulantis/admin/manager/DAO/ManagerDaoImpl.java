package com.khd.jejulantis.admin.manager.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
/*		for(int i = 2;i<15;i++) {
			manager.setBranch_no(i);
			manager.setManager_id("manager"+i);*/
		int insert = sql.insert(ns+".managerresist", manager);
/*		}*/
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

	@Override
	public int managerdelete(String manager_id) {
		int delete = sql.update(ns+".managerdelete", manager_id);
//		System.out.println("id6:"+ manager_id);
		return delete;
	}

	@Override
	public String managerfind_id(String manager_email) {
		String select = sql.selectOne(ns+".managerfind_id",manager_email);
		return select;
	}

	@Override
	public String managerfind_pwd(String manager_id) {
		String select = sql.selectOne(ns+".managerfind_pwd",manager_id);
		return select;
	}

	@Override
	public Manager managergetUsersByID(String manager_id) {
		Manager Select = sql.selectOne(ns + ".loginChecksequrity", manager_id);
		return Select;
	}

	@Override
	public Manager managersecurityloginCheck(Manager manager) {
		System.out.println("id6:"+ manager.getManager_id());
		Manager Select = sql.selectOne(ns+".sequritymanagerloginCheck", manager);
		return Select;
	}
//	@Transactional
//	public int update_pw(Manager manager) throws Exception{
//		int update = sql.selectOne(ns+".find_pwd_update", manager);
//		return update;		
//	}

	@Override
	public int update_pw(Manager manager) {	
		System.out.println("getManager_email:"+ manager.getManager_email());
		int update = sql.update(ns+".find_pwd_update", manager);
		return update;		
		
	}

	@Override
	public int change_pw(Manager manager) {
		int update = sql.update(ns+".change_pwd_update", manager);
		return update;	
	}

	
}
