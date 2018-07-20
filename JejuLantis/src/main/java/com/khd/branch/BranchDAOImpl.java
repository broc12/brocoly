package com.khd.branch;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
}
