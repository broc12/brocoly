package com.khd.ReviewController;

import java.sql.Date;
import java.util.List;

public class BranchName {

	private String review_sel;
	private String branch_no;
	private String branch_name;
	private List reviewList;
	private List reviewCount;
	public BranchName(){}
	
	public BranchName(String review_sel, String branch_no, String branch_name, List reviewList, List reviewCount) {
		super();
		this.review_sel = review_sel;
		this.branch_no = branch_no;
		this.branch_name = branch_name;
		this.reviewList = reviewList;
		this.reviewCount = reviewCount;
	}

	public String getReview_sel() {
		return review_sel;
	}
	public void setReview_sel(String review_sel) {
		this.review_sel = review_sel;
	}
	public String getBranch_no() {
		return branch_no;
	}
	public void setBranch_no(String branch_no) {
		this.branch_no = branch_no;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public List getReviewList() {
		return reviewList;
	}
	public void setReviewList(List reviewList) {
		this.reviewList = reviewList;
	}
	public List getReviewCount() {
		return reviewCount;
	}
	public void setReviewCount(List reviewCount) {
		this.reviewCount = reviewCount;
	}
	
	
}
