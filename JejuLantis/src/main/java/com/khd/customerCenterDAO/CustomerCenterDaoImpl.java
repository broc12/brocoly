package com.khd.customerCenterDAO;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khd.model.CustomerCenter;

@Repository
public class CustomerCenterDaoImpl implements CustomerCenterDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String ns = "query.CustomerCenter";

	@Override
	public List<CustomerCenter> list(HashMap map) {
		
		List<CustomerCenter> list = sqlSession.selectList(ns+".mySelectAll",map);
		
		return list;
	}
	@Override
	public long totalNum() {
		long totalNum = sqlSession.selectOne(ns+".myTotalNum");
		return totalNum;
	}

}
