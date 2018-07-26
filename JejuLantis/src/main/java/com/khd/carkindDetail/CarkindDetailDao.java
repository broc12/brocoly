package com.khd.carkindDetail;

import java.util.List;

import com.khd.carkindDetail.CarkindDetail;

public interface CarkindDetailDao {
	List<CarkindDetail> carkind();
	void delete(String car_kind_no);
	List<CarkindDetail> carkind(String car_kind_no);
	List<CarkindDetail> carkindI();
	void insert(CarkindDetail carkind);
	List<CarkindDetail> carkindSelectBox(String car_kind_no);
	void update(CarkindDetail carkind);
	List<CarkindDetail> insuranceSelectBox();
	
}
