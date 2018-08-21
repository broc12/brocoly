package com.khd.jejulantis.admin.review.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.jejulantis.admin.review.DAO.ReviewDAO;
import com.khd.jejulantis.admin.review.Service.ReviewService;
import com.khd.jejulantis.model.BranchName;
import com.khd.jejulantis.model.ReviewContent;


@Service("creviewService")
public class ReviewServiceImpl implements ReviewService {
	@Autowired
	private ReviewDAO reviewDAO;

	@Override
	public List<ReviewContent> listServiceAll(String manager_id) {
		return reviewDAO.reviewContentAll(manager_id);
	}
	@Override
	public void deleteService(String rent_review_no) {
		reviewDAO.delete(rent_review_no);
	}


	@Override
	public List<ReviewContent> reviewContentService(String rent_review_no) {
		return reviewDAO.reviewDetailContent(rent_review_no);
	}
	@Override
	public void reviewInsertService(ReviewContent reviewContent) {
		reviewDAO.reviewInsert(reviewContent);
	}
	@Override
	public int getCarkindCount(int car_kind_no) {
		return reviewDAO.reviewCarkindCount(car_kind_no);
	}
	@Override
	public int getCarCount(int car_no) {
		return reviewDAO.reviewCarCount(car_no);
	}
	@Override
	public int getBranchCount(int branch_no) {
		return reviewDAO.reviewBranchCount(branch_no);
	}
	
}
