package com.khd.jejulantis.admin.insurance.Service;

import java.util.List;

import com.khd.jejulantis.model.Insurance;

public interface InsuranceService {
	List<Insurance> insuranceListService(String manager_id);
	List<Insurance> insuranceContentService(int insurance_no);
	List<Insurance> carKindSelectBoxService(String manager_id);
	List<Insurance> carKindNotSelectBoxService(String manager_id, int insurance_no);
	List<Insurance> branchNoSelectService(String manager_id);
	List<Insurance> insuranceCarNoService(String manager_id, int car_kind_no);
	List<Insurance> insuranceUpdateService(int insurance_no);
	List<Insurance> kingbranchNotSelectService(String manager_id);
	void deleteService(int insurance_no);
	void insertService(Insurance insurance);
	void updateService(Insurance insurance);
	void updateOkService(Insurance insurance);
}
