package com.khd.admin.PowerDAO;

import java.util.List;

import com.khd.model.PowerModel.Power;

public interface PowerDAO {
	List<Power>list(String manager_id);
	void update(Power power);
}
