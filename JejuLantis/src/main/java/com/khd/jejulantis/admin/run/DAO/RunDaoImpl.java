package com.khd.jejulantis.admin.run.DAO;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khd.jejulantis.model.Admin;
import com.khd.jejulantis.model.Manager;
@Repository
public class RunDaoImpl implements RunDao {
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String ns = "query.admin";
	@Override
	public List<Admin> adminList(String manager_id) {
		List<Admin> adminList = sqlSession.selectList(ns+".adminList", manager_id);
		return adminList;
	}
	@Override
	public List<Admin> adminList() {
		List<Admin> adminList = sqlSession.selectList(ns+".adminList2");
		return adminList;
	}
	@Override
	public void adminApproveDelete(long manager_no) {
		sqlSession.update(ns+".adminApproveDelete", manager_no);
	}
	@Override
	public List<Admin> adminApproveContent(long manager_no) {
		List<Admin> adminApproveContent = sqlSession.selectList(ns+".adminApproveContent", manager_no);
		return adminApproveContent;
	}
	@Override
	public void adminApproveUpdate(Admin admin) {
		sqlSession.update(ns+".adminApproveUpdate", admin);
	}
}
