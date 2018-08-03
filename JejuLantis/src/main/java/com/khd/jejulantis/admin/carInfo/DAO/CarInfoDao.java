package com.khd.jejulantis.admin.carInfo.DAO;

import java.util.List;

import com.khd.jejulantis.model.CarInfo;
import com.khd.jejulantis.model.CarInfoInsert;
import com.khd.jejulantis.model.CarInfoSelect;

public interface CarInfoDao {
	/*boolean carInsert(List<CarInfo> car);*/
	boolean carInfoInsert(List<CarInfo> carInfoList);
	boolean del(String car_info_no);
	boolean carInfoUpdate(CarInfo carInfo);
	List<CarInfoSelect> selectList(String manager_id);
	List<CarInfoInsert> selectCarJoin(String manager_id);
	CarInfo carInfoContent(String car_info_no);
	CarInfoInsert selectBranchNo(Integer car_kind_no);
}
