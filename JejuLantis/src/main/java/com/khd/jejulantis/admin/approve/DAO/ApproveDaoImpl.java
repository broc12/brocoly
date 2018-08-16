package com.khd.jejulantis.admin.approve.DAO;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khd.jejulantis.model.Admin;
@Repository
public class ApproveDaoImpl implements ApproveDao {
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String ns = "query.admin";
	@Override
	public List<Admin> adminApproveList() {
		List<Admin> adminApproveList = sqlSession.selectList(ns+".adminNotApproveList");
		return adminApproveList;
	}
	@Override
	public List<Admin> adminBranchNo(String manager_id) {
		List<Admin> adminBranchNo =sqlSession.selectList(ns+".adminBranchNo", manager_id);
		return adminBranchNo;
	}
	@Override
	public void adminApproveYes(long manager_no) {
		sqlSession.update(ns+".adminApproveYes", manager_no);
	}
	@Override
	public void adminApproveNo(long manager_no) {
		sqlSession.update(ns+".adminDelete", manager_no);
	}
	@Override
	public List<Admin> adminApproveList(long branch_no) {
		List<Admin> adminApproveList2 = sqlSession.selectList(ns+".adminNotApproveList2", branch_no);
		return adminApproveList2;
	}
}
