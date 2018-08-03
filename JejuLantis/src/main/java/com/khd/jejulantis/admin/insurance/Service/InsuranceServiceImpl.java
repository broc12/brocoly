package com.khd.jejulantis.admin.insurance.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.jejulantis.admin.insurance.DAO.InsuranceDao;
import com.khd.jejulantis.model.Insurance;
@Service("insuranceService")
public class InsuranceServiceImpl implements InsuranceService {
	@Autowired
	InsuranceDao InsuranceDao;
	@Override
	public List<Insurance> insuranceListService(String manager_id) {
		return InsuranceDao.insuranceList(manager_id);
	}
	@Override
	public List<Insurance> insuranceContentService(int insurance_no) {
		return InsuranceDao.insuranceContent(insurance_no);
	}
	@Override
	public void deleteService(int insurance_no) {
		InsuranceDao.insuranceDUpdate(insurance_no);
	}
	@Override
	public void insertService(Insurance insurance) {
		InsuranceDao.insuranceInsert(insurance);
	}
	@Override
	public void updateService(Insurance insurance) {
		InsuranceDao.insuranceUpdate(insurance);
	}
	@Override
	public List<Insurance> carKindSelectBoxService(String manager_id) {
		return InsuranceDao.carKindSelectBox(manager_id);
	}
	@Override
	public List<Insurance> branchNoSelectService(String manager_id) {
		return InsuranceDao.branchNoSelect(manager_id);
	}
	@Override
	public List<Insurance> insuranceCarNoService(String manager_id, int car_kind_no) {
		return InsuranceDao.insuranceCarNo(manager_id, car_kind_no);
	}
	@Override
	public List<Insurance> insuranceUpdateService(int insurance_no) {
		return InsuranceDao.insuranceUpdate(insurance_no);
	}
	@Override
	public List<Insurance> carKindNotSelectBoxService(String manager_id, int insurance_no) {
		return InsuranceDao.carKindNotSelectBox(manager_id, insurance_no);
	}
	@Override
	public void updateOkService(Insurance insurance) {
		InsuranceDao.insuranceUpdateOk(insurance);
	}
	@Override
	public List<Insurance> kingbranchNotSelectService(String manager_id) {
		return InsuranceDao.kingBranchNotSelect(manager_id);
	}
	@Override
	public List<Insurance> kingbranchNotSelectService(int branch_no) {
		return InsuranceDao.kingBranchNotSelect(branch_no);
	}
	@Override
	public List<Insurance> kingBranchCarKindSelectService(int branch_no) {
		return InsuranceDao.kingBranchCarKindSelect(branch_no);
	}
	
}
