package com.khd.jejulantis.admin.power.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khd.jejulantis.model.Power;

@Repository
public class PowerDAOImpl implements PowerDAO{
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String ns = "query.ManagerPower";
	
	@Override
	public List<Power>list(String manager_id, long branch_no){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("manager_id", manager_id);
		map.put("branch_no", branch_no);
		List<Power>list = sqlSession.selectList(ns+".myPower2",map);
		return list;
	}
	
	@Override
	public List<Power> list(String manager_id) {
		List<Power>list = sqlSession.selectList(ns+".myPower",manager_id);
		return list;
	}
	@Override
	public void update(Power power) {
		sqlSession.update(ns+".myUpdate",power);
	}
}
