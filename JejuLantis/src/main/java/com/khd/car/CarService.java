package com.khd.car;

import java.util.List;
import com.khd.car.Car;
public interface CarService {
	List<Car>listService();
	void insertService(Car car);
	List<Car>subjectService(long car_no);
	void deleteService(long car_no);
	List<Car>modifyService(long car_no);
	void updateService(Car car);
}
