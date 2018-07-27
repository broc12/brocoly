package com.khd.jejulantis.admin.carInfo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.jejulantis.admin.carInfo.DAO.CarInfoDao;
import com.khd.jejulantis.model.CarInfo;

@Service
public class CarInfoServiceImpl implements CarInfoService {

	@Autowired
	CarInfoDao CarInfoDao;
	
	@Override
	public boolean carInsert(List<CarInfo> car) {
		return CarInfoDao.carInsert(car);
	}
	
	
}
