package com.khd.jejulantis.admin.insurance.DAO;

import java.util.List;

import com.khd.jejulantis.model.Insurance;

public interface InsuranceDao {
	List<Insurance> insuranceList(String manager_id);
	List<Insurance> insuranceContent(int insurance_no);
	List<Insurance> carKindSelectBox(String manager_id);
	List<Insurance> branchNoSelect(String manager_id);
	void insuranceDUpdate(int insurance_no);
	void insuranceUpdate(Insurance insurance);
	void insuranceInsert(Insurance insurance);
}
