package com.khd.ReviewController;

import java.sql.Date;
import java.util.List;

public class BranchName {
	private List reviewList;
	private List reviewCount;
	
	private String count_review;
	private String review_sel;
	private String score;
	private String sale;
	
	private int branch_no;
	private String branch_name;
	private String branch_tel;
	private String branch_local;
	private Date branch_resist;
	private String branch_business_no;
	private String branch_bankaccount;
	private String branch_member_name;
	private String branch_member_tel;
	private String branch_logo;
	private int branch_comfee;
	private String branch_withdraw_at;
	private String branch_busspot;
	private String branch_bustime;
	private String branch_busgap;
	public BranchName(){}
	public BranchName(List reviewList, List reviewCount, String count_review, String review_sel, String score,
			String sale, int branch_no, String branch_name, String branch_tel, String branch_local, Date branch_resist,
			String branch_business_no, String branch_bankaccount, String branch_member_name, String branch_member_tel,
			String branch_logo, int branch_comfee, String branch_withdraw_at, String branch_busspot,
			String branch_bustime, String branch_busgap) {
		super();
		this.reviewList = reviewList;
		this.reviewCount = reviewCount;
		this.count_review = count_review;
		this.review_sel = review_sel;
		this.score = score;
		this.sale = sale;
		this.branch_no = branch_no;
		this.branch_name = branch_name;
		this.branch_tel = branch_tel;
		this.branch_local = branch_local;
		this.branch_resist = branch_resist;
		this.branch_business_no = branch_business_no;
		this.branch_bankaccount = branch_bankaccount;
		this.branch_member_name = branch_member_name;
		this.branch_member_tel = branch_member_tel;
		this.branch_logo = branch_logo;
		this.branch_comfee = branch_comfee;
		this.branch_withdraw_at = branch_withdraw_at;
		this.branch_busspot = branch_busspot;
		this.branch_bustime = branch_bustime;
		this.branch_busgap = branch_busgap;
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
	public String getCount_review() {
		return count_review;
	}
	public void setCount_review(String count_review) {
		this.count_review = count_review;
	}
	public String getReview_sel() {
		return review_sel;
	}
	public void setReview_sel(String review_sel) {
		this.review_sel = review_sel;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getSale() {
		return sale;
	}
	public void setSale(String sale) {
		this.sale = sale;
	}
	public int getBranch_no() {
		return branch_no;
	}
	public void setBranch_no(int branch_no) {
		this.branch_no = branch_no;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getBranch_tel() {
		return branch_tel;
	}
	public void setBranch_tel(String branch_tel) {
		this.branch_tel = branch_tel;
	}
	public String getBranch_local() {
		return branch_local;
	}
	public void setBranch_local(String branch_local) {
		this.branch_local = branch_local;
	}
	public Date getBranch_resist() {
		return branch_resist;
	}
	public void setBranch_resist(Date branch_resist) {
		this.branch_resist = branch_resist;
	}
	public String getBranch_business_no() {
		return branch_business_no;
	}
	public void setBranch_business_no(String branch_business_no) {
		this.branch_business_no = branch_business_no;
	}
	public String getBranch_bankaccount() {
		return branch_bankaccount;
	}
	public void setBranch_bankaccount(String branch_bankaccount) {
		this.branch_bankaccount = branch_bankaccount;
	}
	public String getBranch_member_name() {
		return branch_member_name;
	}
	public void setBranch_member_name(String branch_member_name) {
		this.branch_member_name = branch_member_name;
	}
	public String getBranch_member_tel() {
		return branch_member_tel;
	}
	public void setBranch_member_tel(String branch_member_tel) {
		this.branch_member_tel = branch_member_tel;
	}
	public String getBranch_logo() {
		return branch_logo;
	}
	public void setBranch_logo(String branch_logo) {
		this.branch_logo = branch_logo;
	}
	public int getBranch_comfee() {
		return branch_comfee;
	}
	public void setBranch_comfee(int branch_comfee) {
		this.branch_comfee = branch_comfee;
	}
	public String getBranch_withdraw_at() {
		return branch_withdraw_at;
	}
	public void setBranch_withdraw_at(String branch_withdraw_at) {
		this.branch_withdraw_at = branch_withdraw_at;
	}
	public String getBranch_busspot() {
		return branch_busspot;
	}
	public void setBranch_busspot(String branch_busspot) {
		this.branch_busspot = branch_busspot;
	}
	public String getBranch_bustime() {
		return branch_bustime;
	}
	public void setBranch_bustime(String branch_bustime) {
		this.branch_bustime = branch_bustime;
	}
	public String getBranch_busgap() {
		return branch_busgap;
	}
	public void setBranch_busgap(String branch_busgap) {
		this.branch_busgap = branch_busgap;
	}
}
