package com.khd.branch;

import java.util.List;
import com.khd.branch.Branch;

public interface BranchService {
	List<Branch>listService();
	void insertService(Branch branch);
	List<Branch>subjectService(long branch_no);
	List<Branch>fullService(long branch_no);
	void modifyService(Branch branch);
	void withdrawService(long branch_no);
	
}
