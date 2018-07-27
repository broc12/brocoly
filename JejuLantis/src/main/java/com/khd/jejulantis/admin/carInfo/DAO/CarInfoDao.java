package com.khd.jejulantis.admin.carInfo.DAO;

import java.util.List;

import com.khd.jejulantis.model.CarInfo;

public interface CarInfoDao {
	boolean carInsert(List<CarInfo> car);
}
