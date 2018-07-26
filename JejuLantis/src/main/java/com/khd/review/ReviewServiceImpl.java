package com.khd.review;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.review.BranchName;
import com.khd.review.ReviewContent;
import com.khd.review.ReviewDao;

@Service("reviewService")
public class ReviewServiceImpl implements ReviewService {
	@Autowired
	private ReviewDao reviewDAO;
	@Override
	public List<BranchName> listService() {
		return reviewDAO.branchName();
	}	
	@Override
	public List<ReviewContent> listServiceAll() {
		return reviewDAO.reviewContentAll();
	}
	@Override
	public void deleteService(String rent_review_no) {
		reviewDAO.delete(rent_review_no);
	}
	@Override
	public List<BranchName> selectService(String review_sel) {
		System.out.println("review_sel : " + review_sel);
		return reviewDAO.select(review_sel);
	}
}
