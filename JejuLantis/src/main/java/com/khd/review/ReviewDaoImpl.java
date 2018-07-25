package com.khd.review;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.khd.review.BranchName;
@Repository("ReviewDao")
public class ReviewDaoImpl implements ReviewDao {
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String ns_branchName = "review.BranchName";
	private String ns_reviewContent = "review.ReviewContent";
	@Override
	public List<BranchName> branchName() {
		List<BranchName> branchName = sqlSession.selectList(ns_branchName+".branchName");
		return branchName;
	}
	public List<ReviewContent> reviewContentAll(){
		List<ReviewContent> reviewContent = sqlSession.selectList(ns_reviewContent+".reviewContentAll"); 
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
	@Override
	public List<BranchName> select(String review_sel) {
		System.out.println(review_sel);
		HashMap<String,String> m = new HashMap<String,String>();
		m.put("review_sel", review_sel);
		List<BranchName> branchName = sqlSession.selectList(ns_branchName+".branchNameSelect",m);
		return branchName;
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
