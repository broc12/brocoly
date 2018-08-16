package com.khd.jejulantis.admin.approve.DAO;

import java.util.List;

import com.khd.jejulantis.model.Admin;

public interface ApproveDao {

	List<Admin> adminApproveList();

	List<Admin> adminBranchNo(String manager_id);

	void adminApproveYes(long manager_no);

	void adminApproveNo(long manager_no);

	List<Admin> adminApproveList(long branch_no);
	
}
