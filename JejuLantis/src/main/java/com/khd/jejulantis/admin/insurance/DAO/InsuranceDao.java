package com.khd.jejulantis.admin.insurance.DAO;

import java.util.List;

import com.khd.jejulantis.model.Insurance;

public interface InsuranceDao {
	List<Insurance> insuranceList(String manager_id);
	List<Insurance> insuranceAllList();
 	List<Insurance> insuranceContent(int insurance_no);
	List<Insurance> carKindSelectBox(String manager_id);
	List<Insurance> branchNoSelect(String manager_id);
	List<Insurance> insuranceCarNo (String manager_id, int car_kind_no);
	List<Insurance> insuranceUpdate(int insurance_no);
	List<Insurance> carKindNotSelectBox(String manager_id, int insurance_no);
	List<Insurance> kingBranchNotSelect(String manager_id);
	List<Insurance> kingBranchNotSelect(int branch_no);
	List<Insurance> kingBranchCarKindSelect(int branch_no);
	List<Insurance> identyBNo(String manager_id);
	void insuranceDUpdate(int insurance_no);
	void insuranceUpdate(Insurance insurance);
	void insuranceInsert(Insurance insurance);
	void insuranceUpdateOk(Insurance insurance);
}
