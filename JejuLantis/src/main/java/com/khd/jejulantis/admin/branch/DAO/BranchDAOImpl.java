package com.khd.jejulantis.admin.branch.DAO;

import java.util.HashMap;
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
/*		String[] a = {"제주렌트카","조은렌트카","에이스렌트카","남해렌트카","서귀포렌트카","서문렌트카","제주원렌트카","굿렌트카","용궁렌트카","베스트렌트카","하늘렌트카","제주하이렌트카","스카이렌트카"};
		for(int i = 0;i<a.length;i++){
			branch.setBranch_name(a[i]);*/
			sqlSession.insert(ns+".myInsert",branch);
//		}
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
	@Override
	public void modify(int branch_no, double branch_set1) {
		HashMap<String,Object>map = new HashMap<String,Object>();
		map.put("branch_no",branch_no);
		map.put("branch_set1", branch_set1);
		sqlSession.update(ns+".myModify1",map);
	}
}
