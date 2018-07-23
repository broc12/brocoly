package com.khd.CarkindController;

import java.util.List;

import com.khd.CarkindController.Carkind;

public interface CarkindService {
	List<Carkind> listService();
	List<Carkind> listIService();
	void deleteService(String car_kind_no);
	List<Carkind> contentListService(String car_kind_no);
	void insertService(Carkind carkind);
	List<Carkind> ContentService(String car_kind_no);
	List<Carkind> NotContentService(String car_kind_no);
	void UpdateService(Carkind carkind);
	List<Carkind> insuranceSelectService();
}
