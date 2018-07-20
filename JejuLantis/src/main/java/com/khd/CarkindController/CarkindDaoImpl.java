package com.khd.CarkindController;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository("CarkindDao")
public class CarkindDaoImpl implements CarkindDao {
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String ns_carkind = "carkind.Carkind";
	@Override
	public List<Carkind> carkind() {
		List<Carkind> carkind = sqlSession.selectList(ns_carkind+".carkindList");
		return carkind;
	}
	@Override
	public void delete(String car_kind_no) {
		sqlSession.delete(ns_carkind+".delete", car_kind_no);
	}
	@Override
	public List<Carkind> carkind(String car_kind_no) {
		List<Carkind> carkind = sqlSession.selectList(ns_carkind+".carkindContentList", car_kind_no);
		return carkind;
	}
	@Override
	public List<Carkind> carkindI() {
		List<Carkind> carkind = sqlSession.selectList(ns_carkind+".carkindListI");
		return carkind;
	}
	@Override
	public void insert(Carkind carkind) {
		sqlSession.insert(ns_carkind+".insert", carkind);
	}
	@Override
	public List<Carkind> carkindSelectBox(String car_kind_no) {
		List<Carkind> carkind = sqlSession.selectList(ns_carkind+".carSelectBox", car_kind_no);
		return carkind;
	}
	@Override
	public void update(Carkind carkind) {
		System.out.println("car_no : " + carkind.getCar_no() );
		sqlSession.update(ns_carkind+".carkindUpdate", carkind);
	}
	@Override
	public List<Carkind> insuranceSelectBox() {
		List<Carkind> insuranceSelectBox = sqlSession.selectList(ns_carkind+".insuranceSelectBox");
		return insuranceSelectBox;
	}
}
