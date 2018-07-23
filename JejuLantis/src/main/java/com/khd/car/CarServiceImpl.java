package com.khd.car;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.khd.car.Car;
import com.khd.car.CarDAO;

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
	public List<Car>subjectService(String car_no){
		return carDAO.subject(car_no);
	}
	
	@Override
	public void deleteService(String car_no) {
		carDAO.delete(car_no);
	}
	
	@Override
	public List<Car>modifyService(String car_no){
		return carDAO.modify(car_no);
	}
	
	@Override
	public void updateService(Car car) {
		carDAO.update(car);
	}
}
