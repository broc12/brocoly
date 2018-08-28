package com.khd.jejulantis.client.review.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.jejulantis.client.review.DAO.CReviewDAO;
import com.khd.jejulantis.model.BranchName;

@Service("reviewService")
public class CReviewServiceImpl implements CReviewService{
	
	@Autowired
	private CReviewDAO reviewDAO;
	
	@Override
	public List<BranchName> listService() {
		return reviewDAO.branchName();
	}	
	@Override
	public List<BranchName> selectService(String review_sel) {
		System.out.println("review_sel : " + review_sel);
		return reviewDAO.select(review_sel);
	}
	@Override
	public List<BranchName> listServiceAll(long branch_no) {
		return reviewDAO.reviewContentAll(branch_no);
	}
	
}
