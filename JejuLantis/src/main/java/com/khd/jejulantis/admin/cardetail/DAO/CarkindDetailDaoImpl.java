package com.khd.jejulantis.admin.cardetail.DAO;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khd.jejulantis.model.CarkindDetail;
import com.khd.jejulantis.model.Insurance;
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
	@Override
	public List<CarkindDetail> insuranceUpdateSelectBox(String manager_id, int car_kind_no) {
		HashMap<String,Object> map = new HashMap<String,Object>();
		map.put("manager_id", manager_id);
		map.put("car_kind_no", car_kind_no);
		
		List<CarkindDetail> insuranceSelectBox = sqlSession.selectList(ns_carkind+".insuranceUpdateSelectBox", map);
		return insuranceSelectBox;
	}
	@Override
	public List<CarkindDetail> kingbranchNotSelect(String manager_id) {
		List<CarkindDetail> kingbranchNotSelect = sqlSession.selectList(ns_carkind+".kingbranchNotSelect", manager_id);
		return kingbranchNotSelect;
	}
	@Override
	public List<CarkindDetail> identyBNo(String manager_id) {
		List<CarkindDetail> identyBNo = sqlSession.selectList(ns_carkind+".identyBNo", manager_id);
		return identyBNo;
	}
	@Override
	public List<CarkindDetail> listAll() {
		List<CarkindDetail> listAll = sqlSession.selectList(ns_carkind+".listAll");
		return listAll;
	}
	@Override
	public void update(int car_kind_no, double car_kind_set1) {
		HashMap<String,Object>map = new HashMap<String,Object>(); 
		map.put("car_kind_no", car_kind_no);
		map.put("car_kind_set1", car_kind_set1);
		sqlSession.update(ns_carkind+".update1", map);
	}
}
