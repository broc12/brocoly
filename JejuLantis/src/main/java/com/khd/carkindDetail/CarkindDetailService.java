package com.khd.carkindDetail;

import java.util.List;

import com.khd.carkindDetail.CarkindDetail;

public interface CarkindDetailService {
	List<CarkindDetail> listService();
	List<CarkindDetail> listIService();
	void deleteService(String car_kind_no);
	List<CarkindDetail> contentListService(String car_kind_no);
	void insertService(CarkindDetail carkind);
	List<CarkindDetail> ContentService(String car_kind_no);
	List<CarkindDetail> NotContentService(String car_kind_no);
	void UpdateService(CarkindDetail carkind);
	List<CarkindDetail> insuranceSelectService();
}
