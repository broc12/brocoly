package com.khd.ReviewController;

import java.util.List;
import com.khd.ReviewController.BranchName;
import com.khd.ReviewController.ReviewContent;
public interface ReviewService {
	List<BranchName> listService();
	List<ReviewContent> listServiceAll();
	void deleteService(String rent_review_no);
	List<BranchName> selectService(String review_sel);
	List<ReviewContent> reviewContentService(String rent_review_no);
}
