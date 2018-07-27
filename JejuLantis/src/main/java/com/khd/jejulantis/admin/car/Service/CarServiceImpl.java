package com.khd.jejulantis.admin.car.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.jejulantis.admin.car.DAO.CarDAO;
import com.khd.jejulantis.model.Car;

@Service
public class CarServiceImpl implements CarService{
	@Autowired
	private CarDAO carDAO;
	
	@Override
	public List<Car>listService(){
		return carDAO.list();
	}
	
	@Override
	public void insertService(Car car) {
		carDAO.insert(car);
	}
	
	@Override
	public List<Car>subjectService(long car_no){
		return carDAO.subject(car_no);
	}
	
	@Override
	public void deleteService(long car_no) {
		carDAO.delete(car_no);
	}
	
	@Override
	public List<Car>modifyService(long car_no){
		return carDAO.modify(car_no);
	}
	
	@Override
	public void updateService(Car car) {
		carDAO.update(car);
	}
}
