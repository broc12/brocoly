package com.khd.jejulantis.client.best.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.jejulantis.client.best.DAO.BestDAO;
import com.khd.jejulantis.model.Car;

@Service
public class BestServiceImpl implements BestService{
	@Autowired
	private BestDAO carDAO;
	
	@Override
	public List<Car>bestlistService(){
		return carDAO.bestlist();
	}
	
	@Override
	public List<Car>mdlistService(){
		return carDAO.mdlist();
	}
}
