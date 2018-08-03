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
	public boolean del(String car_info_no) {
		return CarInfoDao.del(car_info_no);
	}
	public boolean carInfoUpdate(CarInfo carInfo) {
		return CarInfoDao.carInfoUpdate(carInfo);
	}
	public List<CarInfoInsert> selectCarJoin(String manager_id){
		return CarInfoDao.selectCarJoin(manager_id);
	}
	public List<CarInfoSelect> selectList(String manager_id){
		return CarInfoDao.selectList(manager_id);
	}
	public CarInfo carInfoContent(String car_info_no) {
		return CarInfoDao.carInfoContent(car_info_no);
	}
	public CarInfoInsert selectBranchNo(Integer car_kind_no){
		return CarInfoDao.selectBranchNo(car_kind_no);
	}
	
}
