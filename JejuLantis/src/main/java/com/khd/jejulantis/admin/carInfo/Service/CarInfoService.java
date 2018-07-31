package com.khd.jejulantis.admin.carInfo.Service;

import java.util.List;

import com.khd.jejulantis.model.*;

public interface CarInfoService {
	boolean carInsert(List<CarInfo> car);
	List<CarInfoInsert> carInfoInsert(String manager_id);
}
