package com.khd.jejulantis.admin.carInfo.Service;

import java.util.List;

import com.khd.jejulantis.model.*;

public interface CarInfoService {
	/*boolean carInsert(List<CarInfo> car);*/
	boolean carInfoInsert(List<CarInfo> carInfoList);
	List<CarInfoSelect> selectList(int manager_id);
	List<CarInfoInsert> selectCarJoin(String manager_id);
	CarInfoInsert selectBranchNo(Integer car_kind_no);
}
