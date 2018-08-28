package com.khd.jejulantis.admin.branch.DAO;

import java.util.List;

import com.khd.jejulantis.model.Branch;

public interface BranchDAO {
	List<Branch>list();
	void insert(Branch branch);
	List<Branch>subject(long branch_no);
	List<Branch>full(long branch_no);
	void modify(Branch branch);
	void withdraw(long branch_no);
	void modify(long branch_no, double branch_set1);
}
