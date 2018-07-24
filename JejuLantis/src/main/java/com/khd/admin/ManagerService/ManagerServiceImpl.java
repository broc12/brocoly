package com.khd.admin.ManagerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.admin.ManagerDAO.ManagerDao;
import com.khd.admin.ManagerDAO.ManagerDaoImpl;
import com.khd.admin.ManagerModel.Manager;
import com.khd.branch.Branch;

@Service
public class ManagerServiceImpl implements ManagerService {
	

	@Autowired
	ManagerDao managerDao; 
	
	@Override
	public boolean joinService(Manager manager1) {		
		return false;
	}

	@Override
	public List<Branch> postService(String branch) {	 
		return managerDao.post(branch);
	}

	@Override
	public int idcheck(String manager_id) {
		return managerDao.idcheck(manager_id);
	}

	@Override
	public int emailcheck(String manager_email) {
		return managerDao.emailcheck(manager_email);
	}
	
}
