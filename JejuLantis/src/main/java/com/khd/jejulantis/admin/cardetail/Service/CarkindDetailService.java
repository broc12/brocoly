package com.khd.jejulantis.admin.cardetail.Service;

import java.util.List;

import com.khd.jejulantis.model.CarkindDetail;
import com.khd.jejulantis.model.Insurance;

public interface CarkindDetailService {
	List<CarkindDetail> listIService();
	void deleteService(long car_kind_no);
	List<CarkindDetail> contentListService(long l);
	void insertService(CarkindDetail carkind);
	List<CarkindDetail> ContentService(long car_kind_no);
	List<CarkindDetail> NotContentService(long car_kind_no);
	void UpdateService(CarkindDetail carkind);
	List<CarkindDetail> insuranceSelectService(String manager_id);
	List<CarkindDetail> insuranceUpdateSelectService(String manager_id, long car_kind_no);
	List<CarkindDetail> branchNoSelect(String manager_id);	
	List<CarkindDetail> listService(String manager_id);
	List<CarkindDetail> kingbranchNotSelectService(String manager_id);
	List<CarkindDetail> identyBNoService(String manager_id);
	List<CarkindDetail> listAllService();
	void UpdateService(long l, double car_kind_set1);
}
