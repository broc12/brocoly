package com.khd.CarkindController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("carkindService")
public class CarkindServiceImpl implements CarkindService {
	@Autowired
	private CarkindDao carkindDAO;
	@Override
	public List<Carkind> listService() {
		return carkindDAO.carkind();
	}
	@Override
	public void deleteService(String car_kind_no) {
		carkindDAO.delete(car_kind_no);
	}
	@Override
	public List<Carkind> contentListService(String car_kind_no) {
		return carkindDAO.carkind(car_kind_no);
	}
	@Override
	public List<Carkind> listIService() {
		return carkindDAO.carkindI();
	}
	@Override
	public void insertService(Carkind carkind) {
		carkindDAO.insert(carkind);
	}
	@Override
	public List<Carkind> ContentService(String car_kind_no) {
		return carkindDAO.carkind(car_kind_no);
	}
	@Override
	public List<Carkind> NotContentService(String car_kind_no) {
		return carkindDAO.carkindSelectBox(car_kind_no);
	}
	@Override
	public void UpdateService(Carkind carkind) {
		carkindDAO.update(carkind);
	}
	@Override
	public List<Carkind> insuranceSelectService() {
		return carkindDAO.insuranceSelectBox();
	}
}
