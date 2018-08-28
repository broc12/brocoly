package com.khd.jejulantis.client.review.DAO;

import java.util.List;

import com.khd.jejulantis.model.BranchName;

public interface CReviewDAO {
	List<BranchName> branchName();
	List<BranchName> select(String review_sel);
	List<BranchName> reviewContentAll(long branch_no);
}
