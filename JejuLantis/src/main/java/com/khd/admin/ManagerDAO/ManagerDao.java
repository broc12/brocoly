package com.khd.admin.ManagerDAO;

import java.util.List;

import com.khd.admin.ManagerModel.Manager;
import com.khd.branch.Branch;

public interface ManagerDao {
	boolean join(Manager manager);

	List<Branch> post(String branch);

	int idcheck(String manager_id);
	int emailcheck(String manager_email);

	boolean loginCheck(Manager manager);
	
}
