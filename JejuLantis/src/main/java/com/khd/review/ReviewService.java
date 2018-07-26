package com.khd.review;

import java.util.List;

import com.khd.review.BranchName;
import com.khd.review.ReviewContent;
public interface ReviewService {
	List<BranchName> listService();
	List<ReviewContent> listServiceAll();
	void deleteService(String rent_review_no);
	List<BranchName> selectService(String review_sel);

	List<ReviewContent> reviewContentService(String rent_review_no);
	List<BranchName> listServiceAll(int branch_no);

}
