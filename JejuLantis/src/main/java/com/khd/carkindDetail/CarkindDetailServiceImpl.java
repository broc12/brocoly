package com.khd.carkindDetail;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
}
