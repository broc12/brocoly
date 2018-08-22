package com.khd.jejulantis.admin.run.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.jejulantis.admin.run.DAO.RunDao;
import com.khd.jejulantis.model.Admin;
import com.khd.jejulantis.model.Manager;
@Service
public class RunSerivceImpl implements RunService {
	@Autowired
	RunDao rundao;
	@Override
	public List<Admin> adminListService(String manager_id) {
		return rundao.adminList(manager_id);
	}
	@Override
	public List<Admin> adminListService() {
		return rundao.adminList();
	}
	@Override
	public void adminApproveDeleteSelect(long manager_no) {
		rundao.adminApproveDelete(manager_no);
	}
	@Override
	public List<Admin> adminApproveContentSelect(long manager_no) {
		return rundao.adminApproveContent(manager_no);
	}
	@Override
	public void adminApproveUpdateSelect(Admin admin) {
		rundao.adminApproveUpdate(admin);
	}
}
