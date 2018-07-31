package com.khd.jejulantis.admin.manager.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.jejulantis.admin.manager.DAO.ManagerDao;
import com.khd.jejulantis.model.Branch;
import com.khd.jejulantis.model.Manager;
import com.khd.jejulantis.model.Member;

@Service
public class ManagerServiceImpl implements ManagerService {

	@Autowired
	ManagerDao managerDao; 
	
	@Override
	public boolean joinService(Manager manager) {		
		return managerDao.join(manager);
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

	@Override
	public Manager loginCheck(Manager manager) {
		return managerDao.loginCheck(manager);
	}

	@Override
	public Manager mypageService(String manager_id) {		
		return managerDao.mypage(manager_id);
	}

	@Override
	public Manager modifyService(Manager manager) {
		// TODO Auto-generated method stub
		return managerDao.modify(manager);
	}
	
}
