package com.khd.admin.ManagerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.khd.admin.ManagerDAO.ManagerDaoImpl;
import com.khd.admin.ManagerModel.Manager;

@Service
public class ManagerServiceImpl implements ManagerService {
	

	@Autowired
	ManagerDaoImpl managerDao = new ManagerDaoImpl();
	
	@Override
	public boolean joinService(Manager manager) {		
		return false;
	}
	
}
