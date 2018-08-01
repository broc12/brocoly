package com.khd.jejulantis.admin.insurance.DAO;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khd.jejulantis.model.Insurance;
@Repository("InsuranceDao")
public class InsuranceDaoImpl implements InsuranceDao {
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String ns_insurance = "insurance.Insurance";
	@Override
	public List<Insurance> insuranceList(String manager_id) {
		List<Insurance> insuranceList = sqlSession.selectList(ns_insurance+".insuranceList", manager_id);
		return insuranceList;
	}
	@Override
	public List<Insurance> insuranceContent(int insurance_no) {
		List<Insurance> insuranceContent = sqlSession.selectList(ns_insurance+".insuranceContent", insurance_no);
		return insuranceContent;
	}
	@Override
	public void insuranceDUpdate(int insurance_no) {
		sqlSession.update(ns_insurance+".insuranceDUpdate", insurance_no);
	}
	@Override
	public void insuranceUpdate(Insurance insurance) {
		sqlSession.update(ns_insurance+".insuranceUpdate", insurance);
	}
	@Override
	public void insuranceInsert(Insurance insurance) {
		sqlSession.insert(ns_insurance+".insuranceInsert", insurance);
	}
	@Override
	public List<Insurance> carKindSelectBox(String manager_id) {
		List<Insurance> carKindSelectBox = sqlSession.selectList(ns_insurance+".carKindSelectBox", manager_id);
		return carKindSelectBox;
	}
	@Override
	public List<Insurance> branchNoSelect(String manager_id) {
		List<Insurance> branchNoSelect = sqlSession.selectList(ns_insurance+".branchNoSelect", manager_id);
		return branchNoSelect;
	}
}