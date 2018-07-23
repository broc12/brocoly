package com.khd.car;

import java.util.List;
import com.khd.car.Car;
public interface CarService {
	List<Car>listService();
	void insertService(Car car);
	List<Car>subjectService(String car_no);
	void deleteService(String car_no);
	List<Car>modifyService(String car_no);
	void updateService(Car car);
}
