package com.khd.car;

import java.util.List;

public interface CarDAO {
	List<Car>list();
	void insert(Car car);
	List<Car>subject(long car_no);
	void delete(long car_no);
	List<Car>modify(long car_no);
	void update(Car car);
}
