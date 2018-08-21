package com.khd.jejulantis.admin.cardetail.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.jejulantis.admin.cardetail.DAO.CarkindDetailDao;
import com.khd.jejulantis.model.CarkindDetail;
import com.khd.jejulantis.model.Insurance;

@Service("carkindService")
public class CarkindDetailServiceImpl implements CarkindDetailService {
	@Autowired
	private CarkindDetailDao carkindDAO;
	@Override
	public List<CarkindDetail> listService(String manager_id) {
		return carkindDAO.carkind(manager_id);
	}
	@Override
	public void deleteService(int car_kind_no) {
		carkindDAO.delete(car_kind_no);
	}
	@Override
	public List<CarkindDetail> contentListService(int car_kind_no) {
		return carkindDAO.carkind(car_kind_no);
	}
	@Override
	public List<CarkindDetail> listIService() {
		return carkindDAO.carkindI();
	}
	@Override
	public void insertService(CarkindDetail carkind) {
		carkindDAO.insert(carkind);
	}
	@Override
	public List<CarkindDetail> ContentService(int car_kind_no) {
		return carkindDAO.carkind(car_kind_no);
	}
	@Override
	public List<CarkindDetail> NotContentService(int car_kind_no) {
		return carkindDAO.carkindSelectBox(car_kind_no);
	}
	@Override
	public void UpdateService(CarkindDetail carkind) {
		carkindDAO.update(carkind);
	}
	@Override
	public List<CarkindDetail> insuranceSelectService(String manager_id) {
		return carkindDAO.insuranceSelectBox(manager_id);
	}
	@Override
	public List<CarkindDetail> branchNoSelect(String manager_id) {
		return carkindDAO.branchNoSelect(manager_id);
	}
	@Override
	public List<CarkindDetail> insuranceUpdateSelectService(String manager_id, int car_kind_no) {
		return carkindDAO.insuranceUpdateSelectBox(manager_id, car_kind_no);
	}
	@Override
	public List<CarkindDetail> kingbranchNotSelectService(String manager_id) {
		return carkindDAO.kingbranchNotSelect(manager_id);
	}
	@Override
	public List<CarkindDetail> identyBNoService(String manager_id) {
		return  carkindDAO.identyBNo(manager_id);
	}
	@Override
	public List<CarkindDetail> listAllService() {
		return carkindDAO.listAll();
	}
	@Override
	public void UpdateService(int car_kind_no, double car_kind_set1) {
		carkindDAO.update(car_kind_no, car_kind_set1);
	}
}
