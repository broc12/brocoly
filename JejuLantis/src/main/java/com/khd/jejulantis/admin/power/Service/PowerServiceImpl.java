package com.khd.jejulantis.admin.power.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.jejulantis.admin.power.DAO.PowerDAO;
import com.khd.jejulantis.model.Power;

@Service
public class PowerServiceImpl implements PowerService{
	@Autowired
	private PowerDAO powerDAO;
	
	@Override
	public List<Power>listService(String manager_id, long branch_no){
		return powerDAO.list(manager_id, branch_no);
	}
	
	@Override
	public List<Power> listService(String manager_id) {
		return powerDAO.list(manager_id);
	}

	@Override
	public void updateService(Power power) {
		powerDAO.update(power);
	}
}
