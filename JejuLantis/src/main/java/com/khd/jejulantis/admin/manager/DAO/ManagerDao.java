package com.khd.jejulantis.admin.manager.DAO;

import java.util.List;

import com.khd.jejulantis.model.Branch;
import com.khd.jejulantis.model.Manager;
import com.khd.jejulantis.model.Member;

public interface ManagerDao {
	boolean join(Manager manager);

	List<Branch> post(String branch);

	int idcheck(String manager_id);
	int emailcheck(String manager_email);

	Manager loginCheck(Manager manager);

	Manager mypage(String manager_id);

	Manager modify(Manager manager);

	int managerdelete(String manager_id);

	String managerfind_id(String manager_email);

	String managerfind_pwd(String manager_id);
	
}
