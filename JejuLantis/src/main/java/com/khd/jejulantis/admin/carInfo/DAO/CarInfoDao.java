package com.khd.jejulantis.admin.carInfo.DAO;

import java.util.List;

import com.khd.jejulantis.model.CarInfo;
import com.khd.jejulantis.model.CarInfoInsert;
import com.khd.jejulantis.model.CarInfoSelect;

public interface CarInfoDao {
	/*boolean carInsert(List<CarInfo> car);*/
	boolean carInfoInsert(List<CarInfo> carInfoList);
	List<CarInfoSelect> selectList(int manager_id);
	List<CarInfoInsert> selectCarJoin(String manager_id);
	CarInfoInsert selectBranchNo(Integer car_kind_no);
}
