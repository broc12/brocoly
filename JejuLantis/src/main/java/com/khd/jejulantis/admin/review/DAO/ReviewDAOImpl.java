package com.khd.jejulantis.admin.review.DAO;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khd.jejulantis.model.BranchName;
import com.khd.jejulantis.model.ReviewContent;

@Repository("ReviewDao")
public class ReviewDAOImpl implements ReviewDAO {
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String ns_branchName = "review.BranchName";
	private String ns_reviewContent = "review.ReviewContent";
	
	public List<ReviewContent> reviewContentAll(String manager_id){
		List<ReviewContent> reviewContent = sqlSession.selectList(ns_reviewContent+".reviewContentAll", manager_id); 
		return reviewContent;		
	}
	public void delete(String rent_review_no) {
		sqlSession.delete(ns_reviewContent+".delete", rent_review_no);
	}
	public List<ReviewContent> reviewContent(){
		List<ReviewContent> reviewContent = sqlSession.selectList(ns_reviewContent+".reviewContent"); 
		return reviewContent;		
	}

	public List<ReviewContent> reviewDetailContent(String rent_review_no){
		List<ReviewContent> reviewDetailContent = sqlSession.selectList(ns_reviewContent+".reviewDetailContent", rent_review_no); 
		return reviewDetailContent;		
	}

	public List<BranchName> branchNameContent(String branch_no){
		System.out.println(branch_no);
		List<BranchName> branchNameContent = sqlSession.selectList(ns_branchName+".branchNameContent", branch_no);
		return branchNameContent;
	}
	@Override
	public List<BranchName> listSelect() {
		List<BranchName> listSelect = sqlSession.selectList(ns_branchName+".adminBranchNameContent");
		return listSelect;
	}

}
