package com.khd.jejulantis.admin.manager.Service;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;

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
	String find_id(String manager_email);
	String find_pwd(String manager_id);
	Manager getUsersByID(String manager_id);
	Manager securityloginCheck(Manager manager);
	void find_pw(HttpServletResponse response, Manager manager, String manager_id, String manager_eamil, Model md)
			throws IOException;
	void changePwd(Manager manager);
	
	
}
