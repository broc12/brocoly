package com.khd.carkindDetail;

import java.util.List;

import com.khd.carkindDetail.CarkindDetail;

public interface CarkindDetailDao {
	List<CarkindDetail> carkind(String manager_id);
	void delete(int car_kind_no);
	List<CarkindDetail> carkind(int car_kind_no);
	List<CarkindDetail> carkindI();
	void insert(CarkindDetail carkind);
	List<CarkindDetail> carkindSelectBox(int car_kind_no);
	void update(CarkindDetail carkind);
	List<CarkindDetail> insuranceSelectBox(String manager_id);
	List<CarkindDetail> branchNoSelect(String manager_id);
}
