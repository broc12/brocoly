package com.khd.admin.carInfo.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.customerCenterDAO.CustomerCenterDao;
import com.khd.model.*;
import com.khd.admin.carInfo.DAO.*;

@Service
public class CarInfoServiceImpl implements CarInfoService {

	@Autowired
	CarInfoDao CarInfoDao;
	
	@Override
	public boolean carInsert(List<CarInfo> car) {
		return CarInfoDao.carInsert(car);
	}
	
	
}
