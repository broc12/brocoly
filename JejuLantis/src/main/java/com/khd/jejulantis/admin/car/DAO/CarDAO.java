package com.khd.jejulantis.admin.car.DAO;

import java.util.List;

import com.khd.jejulantis.model.Car;

public interface CarDAO {
	List<Car>list();
	void insert(Car car);
	List<Car>subject(long car_no);
	void delete(long car_no);
	List<Car>modify(long car_no);
	void update(Car car);
	void best(List<Long>best);
	void update(int car_no, double car_set1);
	void md(List<Long>md);
}
