package com.khd.admin.ManagerService;

import java.util.List;

import com.khd.admin.ManagerModel.Manager;
import com.khd.branch.Branch;

public interface ManagerService {

	boolean joinService(Manager manager);
	List<Branch> postService(String branch);
	int idcheck(String manager_id);
	int emailcheck(String manager_email);
}
