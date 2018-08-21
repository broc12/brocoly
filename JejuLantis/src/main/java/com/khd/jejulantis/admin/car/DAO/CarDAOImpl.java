package com.khd.jejulantis.admin.car.DAO;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khd.jejulantis.model.Car;

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
	@Override
	public void best(List<Long>best) {
		sqlSession.update(ns+".myBestN");
		if(best != null) {
			HashMap<String,List<Long>>map = new HashMap<String,List<Long>>();
			map.put("best", best);
			sqlSession.update(ns+".myBestY",map);
		}
	}
	@Override
	public void update(int car_no, double car_set1) {
		HashMap<String,Object> map = new HashMap<String,Object>();
		map.put("car_no", car_no);
		map.put("car_set1", car_set1);
		sqlSession.update(ns+".myUpdate1", map);
	}
	@Override
	public void md(List<Long>md) {
		sqlSession.update(ns+".myMdN");
		if(md != null) {
			HashMap<String,List<Long>>map = new HashMap<String,List<Long>>();
			map.put("md", md);
			sqlSession.update(ns+".myMdY",map);
		}
	}
}
