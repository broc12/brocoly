package com.khd.admin.PowerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.admin.PowerDAO.PowerDAO;
import com.khd.model.PowerModel.Power;

@Service
public class PowerServiceImpl implements PowerService{
	@Autowired
	private PowerDAO powerDAO;
	
	@Override
	public List<Power>listService(String manager_id){
		return powerDAO.list(manager_id);
	}
	
	@Override
	public void updateService(Power power) {
		powerDAO.update(power);
	}
}
