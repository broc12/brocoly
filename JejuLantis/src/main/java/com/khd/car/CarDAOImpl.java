package com.khd.car;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CarDAOImpl implements CarDAO{
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String ns = "query.car";
	
	@Override
	public List<Car>list(){
		List<Car>list = sqlSession.selectList(ns+".myCar");
		return list;
	}
	@Override
	public void insert(Car car) {
		sqlSession.insert(ns+".myInsert",car);
	}
	@Override
	public List<Car>subject(long car_no){
		List<Car>subject = sqlSession.selectList(ns+".mySubject",car_no);
		return subject;
	}
	@Override
	public void delete(long car_no) {
		sqlSession.delete(ns+".myDelete",car_no);
	}
	@Override
	public List<Car>modify(long car_no){
		List<Car>modify = sqlSession.selectList(ns+".myModify",car_no);
		return modify;
	}
	@Override
	public void update(Car car) {
		sqlSession.update(ns+".myUpdate",car);
	}
}
