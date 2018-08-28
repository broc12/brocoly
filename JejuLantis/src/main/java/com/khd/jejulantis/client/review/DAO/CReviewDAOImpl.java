package com.khd.jejulantis.client.review.DAO;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khd.jejulantis.model.BranchName;

@Repository("CReviewDao")
public class CReviewDAOImpl implements CReviewDAO{
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String ns_branchName = "review.BranchName";
	
	@Override
	public List<BranchName> branchName() {
		List<BranchName> branchName = sqlSession.selectList(ns_branchName+".branchName");
		return branchName;
	}
	
	@Override
	public List<BranchName> select(String review_sel) {
		System.out.println(review_sel);
		HashMap<String,String> m = new HashMap<String,String>();
		m.put("review_sel", review_sel);
		List<BranchName> branchName = sqlSession.selectList(ns_branchName+".branchNameSelect",m);
		return branchName;
	}
	
	@Override
	public List<BranchName> reviewContentAll(long branch_no) {
		List<BranchName> reviewContent = sqlSession.selectList(ns_branchName+".branchNameContent", branch_no);
		return reviewContent;
	}
}
