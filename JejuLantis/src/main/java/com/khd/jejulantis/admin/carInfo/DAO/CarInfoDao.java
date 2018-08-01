package com.khd.jejulantis.admin.carInfo.DAO;

import java.util.List;

import com.khd.jejulantis.model.CarInfo;
import com.khd.jejulantis.model.CarInfoInsert;

public interface CarInfoDao {
	boolean carInsert(List<CarInfo> car);
	List<CarInfoInsert> carInfoInsert(String manager_id);
	List<CarInfoInsert> selectBranchNo(Integer car_kind_no);
}
