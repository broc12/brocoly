package com.khd.jejulantis.client.best.DAO;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khd.jejulantis.model.Car;

@Repository
public class BestDAOImpl implements BestDAO{
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String ns = "query.car";
	
	@Override
	public List<Car>bestlist(){
		List<Car>bestlist = sqlSession.selectList(ns+".myBestlist");
		return bestlist;
	}
}
