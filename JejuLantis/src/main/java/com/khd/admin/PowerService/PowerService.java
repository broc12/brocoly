package com.khd.admin.PowerService;

import java.util.List;

import com.khd.model.PowerModel.Power;

public interface PowerService {
	List<Power>listService(String manager_id);
	void updateService(Power power);
}
