package com.khd.jejulantis.client.review.Service;

import java.util.List;

import com.khd.jejulantis.model.BranchName;
import com.khd.jejulantis.model.ReviewContent;

public interface CReviewService {
	List<BranchName> listService();
	List<BranchName> selectService(String review_sel);
	List<BranchName> listServiceAll(long branch_no);
}
