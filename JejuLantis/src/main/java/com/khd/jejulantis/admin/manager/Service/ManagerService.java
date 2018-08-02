package com.khd.jejulantis.admin.manager.Service;

import java.util.List;

import com.khd.jejulantis.model.Branch;
import com.khd.jejulantis.model.Manager;
import com.khd.jejulantis.model.Member;

public interface ManagerService {

	boolean joinService(Manager manager);
	List<Branch> postService(String branch);
	int idcheck(String manager_id);
	int emailcheck(String manager_email);
	Manager loginCheck(Manager manager);
	Manager mypageService(String manager_id);
	Manager modifyService(Manager manager);
	int managerdeleteService(String manager_id);
}
