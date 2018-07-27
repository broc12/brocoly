package com.khd.jejulantis.admin.power.Service;

import java.util.List;

import com.khd.jejulantis.model.Power;

public interface PowerService {
	List<Power>listService(String manager_id);
	void updateService(Power power);
}
