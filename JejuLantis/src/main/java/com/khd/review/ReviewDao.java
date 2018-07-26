package com.khd.review;

import java.util.List;

import com.khd.review.BranchName;
public interface ReviewDao {
	List<BranchName> branchName();
	List<ReviewContent> reviewContentAll();	
	void delete(String rent_review_no);
	List<BranchName> select(String review_sel);
	List<ReviewContent> reviewContent();

	List<ReviewContent> reviewDetailContent(String rent_review_no);
	List<BranchName> branchNameContent(String branch_no);
	List<BranchName> reviewContentAll(int branch_no);
	List<BranchName> listSelect();

}