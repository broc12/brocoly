package com.khd.ReviewController;

import java.util.List;

import com.khd.ReviewController.BranchName;
public interface ReviewDao {
	List<BranchName> branchName();
	List<ReviewContent> reviewContentAll();	
	void delete(String rent_review_no);
	List<BranchName> select(String review_sel);
	List<ReviewContent> reviewContent();
}