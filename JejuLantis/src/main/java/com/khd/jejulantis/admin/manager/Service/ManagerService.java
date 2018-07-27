package com.khd.jejulantis.admin.manager.Service;

import java.util.List;

import com.khd.jejulantis.model.Branch;
import com.khd.jejulantis.model.Manager;

public interface ManagerService {

	boolean joinService(Manager manager);
	List<Branch> postService(String branch);
	int idcheck(String manager_id);
	int emailcheck(String manager_email);
	Manager loginCheck(Manager manager);
}
