package com.khd.jejulantis.admin.review.Service;

import java.util.List;

import com.khd.jejulantis.model.BranchName;
import com.khd.jejulantis.model.ReviewContent;
public interface ReviewService {
	List<ReviewContent> listServiceAll(String manager_id);
	void deleteService(String rent_review_no);
	List<ReviewContent> reviewContentService(String rent_review_no);
	void reviewInsertService(ReviewContent reviewContent);
	long getCarkindCount(long l);
	long getCarCount(long l);
	long getBranchCount(long l);

}
