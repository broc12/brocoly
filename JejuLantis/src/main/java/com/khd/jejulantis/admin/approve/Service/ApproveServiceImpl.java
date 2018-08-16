package com.khd.jejulantis.admin.approve.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.jejulantis.admin.approve.DAO.ApproveDao;
import com.khd.jejulantis.model.Admin;

@Service
public class ApproveServiceImpl implements ApproveService {
	@Autowired
	ApproveDao approvedao;
	@Override
	public List<Admin> adminApproveListService() {
		return approvedao.adminApproveList();
	}
	@Override
	public List<Admin> adminBranchNoService(String manager_id) {
		return approvedao.adminBranchNo(manager_id);
	}
	@Override
	public void adminApproveYesSelect(long manager_no) {
		approvedao.adminApproveYes(manager_no);
	}
	@Override
	public void adminApproveNoSelect(long manager_no) {
		approvedao.adminApproveNo(manager_no);
	}
	@Override
	public List<Admin> adminApproveListService(long branch_no) {
		return approvedao.adminApproveList(branch_no);
	}
}
