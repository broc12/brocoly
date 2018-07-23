package com.khd.car;

import java.util.List;

public interface CarDAO {
	List<Car>list();
	void insert(Car car);
	List<Car>subject(String car_no);
	void delete(String car_no);
	List<Car>modify(String car_no);
	void update(Car car);
}
