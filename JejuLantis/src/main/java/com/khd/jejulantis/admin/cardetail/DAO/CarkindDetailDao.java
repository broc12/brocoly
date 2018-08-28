package com.khd.jejulantis.admin.cardetail.DAO;

import java.util.List;

import com.khd.jejulantis.model.CarkindDetail;

public interface CarkindDetailDao {
	List<CarkindDetail> carkind(String manager_id);
	void delete(long car_kind_no);
	List<CarkindDetail> carkind(long car_kind_no);
	List<CarkindDetail> carkindI();
	void insert(CarkindDetail carkind);
	List<CarkindDetail> carkindSelectBox(long car_kind_no);
	List<CarkindDetail> insuranceUpdateSelectBox(String manager_id, long car_kind_no);
	void update(CarkindDetail carkind);
	List<CarkindDetail> insuranceSelectBox(String manager_id);
	List<CarkindDetail> branchNoSelect(String manager_id);
	List<CarkindDetail> kingbranchNotSelect(String manager_id);
	List<CarkindDetail> identyBNo(String manager_id);
	List<CarkindDetail> listAll();
	void update(long car_kind_no, double car_kind_set1);
}
