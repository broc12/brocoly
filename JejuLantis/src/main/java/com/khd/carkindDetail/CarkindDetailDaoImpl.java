package com.khd.carkindDetail;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository("CarkindDao")
public class CarkindDetailDaoImpl implements CarkindDetailDao {
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String ns_carkind = "carkind.Carkind";
	@Override
	public List<CarkindDetail> carkind(String manager_id) {
		List<CarkindDetail> carkind = sqlSession.selectList(ns_carkind+".carkindList", manager_id);
		return carkind;
	}
	@Override
	public void delete(int car_kind_no) {
		sqlSession.update(ns_carkind+".update", car_kind_no);
	}
	@Override
	public List<CarkindDetail> carkind(int car_kind_no) {
		List<CarkindDetail> carkind = sqlSession.selectList(ns_carkind+".carkindContentList", car_kind_no);
		return carkind;
	}
	@Override
	public List<CarkindDetail> carkindI() {
		List<CarkindDetail> carkind = sqlSession.selectList(ns_carkind+".carkindListI");
		return carkind;
	}
	@Override
	public void insert(CarkindDetail carkind) {
		sqlSession.insert(ns_carkind+".insert", carkind);
	}
	@Override
	public List<CarkindDetail> carkindSelectBox(int car_kind_no) {
		List<CarkindDetail> carkind = sqlSession.selectList(ns_carkind+".carSelectBox", car_kind_no);
		return carkind;
	}
	@Override
	public void update(CarkindDetail carkind) {
		System.out.println("car_no : " + carkind.getCar_no() );
		sqlSession.update(ns_carkind+".carkindUpdate", carkind);
	}
	@Override
	public List<CarkindDetail> insuranceSelectBox(String manager_id) {
		List<CarkindDetail> insuranceSelectBox = sqlSession.selectList(ns_carkind+".insuranceSelectBox", manager_id);
		return insuranceSelectBox;
	}
	@Override
	public List<CarkindDetail> branchNoSelect(String manager_id) {
		List<CarkindDetail> branchNoSelect = sqlSession.selectList(ns_carkind+".branchNoSelect", manager_id);
		return branchNoSelect;
	}
	
}
