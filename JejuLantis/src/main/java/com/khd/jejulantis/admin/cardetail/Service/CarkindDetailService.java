package com.khd.jejulantis.admin.cardetail.Service;

import java.util.List;

import com.khd.jejulantis.model.CarkindDetail;

public interface CarkindDetailService {
	List<CarkindDetail> listService(String manager_id);
	List<CarkindDetail> listIService();
	void deleteService(int car_kind_no);
	List<CarkindDetail> contentListService(int car_kind_no);
	void insertService(CarkindDetail carkind);
	List<CarkindDetail> ContentService(int car_kind_no);
	List<CarkindDetail> NotContentService(int car_kind_no);
	void UpdateService(CarkindDetail carkind);
	List<CarkindDetail> insuranceSelectService(String manager_id);
	List<CarkindDetail> insuranceUpdateSelectService(String manager_id, int car_kind_no);
	List<CarkindDetail> branchNoSelect(String manager_id);
}
