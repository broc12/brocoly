package com.khd.jejulantis.admin.approve.Service;

import java.util.List;

import com.khd.jejulantis.model.Admin;

public interface ApproveService {

	List<Admin> adminApproveListService();

	List<Admin> adminBranchNoService(String manager_id);

	void adminApproveYesSelect(long manager_no);

	void adminApproveNoSelect(long manager_no);

	List<Admin> adminApproveListService(long branch_no);

}
