package com.khd.carkindDetail;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("carkindService")
public class CarkindDetailServiceImpl implements CarkindDetailService {
	@Autowired
	private CarkindDetailDao carkindDAO;
	@Override
	public List<CarkindDetail> listService() {
		return carkindDAO.carkind();
	}
	@Override
	public void deleteService(String car_kind_no) {
		carkindDAO.delete(car_kind_no);
	}
	@Override
	public List<CarkindDetail> contentListService(String car_kind_no) {
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
	public List<CarkindDetail> ContentService(String car_kind_no) {
		return carkindDAO.carkind(car_kind_no);
	}
	@Override
	public List<CarkindDetail> NotContentService(String car_kind_no) {
		return carkindDAO.carkindSelectBox(car_kind_no);
	}
	@Override
	public void UpdateService(CarkindDetail carkind) {
		carkindDAO.update(carkind);
	}
	@Override
	public List<CarkindDetail> insuranceSelectService() {
		return carkindDAO.insuranceSelectBox();
	}
}
