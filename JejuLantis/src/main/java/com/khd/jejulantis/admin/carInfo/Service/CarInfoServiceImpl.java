package com.khd.jejulantis.admin.carInfo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.jejulantis.admin.carInfo.DAO.CarInfoDao;
import com.khd.jejulantis.model.CarInfo;
import com.khd.jejulantis.model.CarInfoInsert;
import com.khd.jejulantis.model.CarInfoSelect;

@Service
public class CarInfoServiceImpl implements CarInfoService {

	@Autowired
	CarInfoDao CarInfoDao;
	
	@Override
	/*public boolean carInsert(List<CarInfo> car) {
		return CarInfoDao.carInsert(car);
	}*/
	public boolean carInfoInsert(List<CarInfo> carInfoList) {
		return CarInfoDao.carInfoInsert(carInfoList);
	}
	public List<CarInfoInsert> selectCarJoin(String manager_id){
		return CarInfoDao.selectCarJoin(manager_id);
	}
	public List<CarInfoSelect> selectList(int manager_id){
		return CarInfoDao.selectList(manager_id);
	}
	public CarInfoInsert selectBranchNo(Integer car_kind_no){
		return CarInfoDao.selectBranchNo(car_kind_no);
	}
	
}
