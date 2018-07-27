package com.khd.jejulantis.admin.branch.DAO;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khd.jejulantis.model.Branch;

@Repository
public class BranchDAOImpl implements BranchDAO{
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String ns = "query.branch";
	
	@Override
	public List<Branch>list(){
		List<Branch>list = sqlSession.selectList(ns+".myBranch");
		return list;
	}
	@Override
	public void insert(Branch branch) {
		sqlSession.insert(ns+".myInsert",branch);
	}
	
	@Override
	public List<Branch>subject(long branch_no){
		List<Branch>subject = sqlSession.selectList(ns+".mySubject",branch_no);
		return subject;
	}
	@Override
	public List<Branch>full(long branch_no){
		List<Branch>full = sqlSession.selectList(ns+".myFull",branch_no);
		return full;
	}
	@Override
	public void modify(Branch branch) {
		sqlSession.update(ns+".myModify",branch);
	}
	@Override
	public void withdraw(long branch_no) {
		sqlSession.update(ns+".myWithdraw",branch_no);
	}
	
}
