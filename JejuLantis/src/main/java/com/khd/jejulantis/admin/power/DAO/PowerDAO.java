package com.khd.jejulantis.admin.power.DAO;

import java.util.List;

import com.khd.jejulantis.model.Power;

public interface PowerDAO {
	List<Power>list(String manager_id, long branch_no);
	void update(Power power);
	List<Power> list(String manager_id);
}
