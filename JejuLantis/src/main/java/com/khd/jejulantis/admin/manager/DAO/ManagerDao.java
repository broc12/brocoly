package com.khd.jejulantis.admin.manager.DAO;

import java.util.List;

import com.khd.jejulantis.model.Branch;
import com.khd.jejulantis.model.Manager;

public interface ManagerDao {
	boolean join(Manager manager);

	List<Branch> post(String branch);

	int idcheck(String manager_id);
	int emailcheck(String manager_email);

	Manager loginCheck(Manager manager);
	
}
