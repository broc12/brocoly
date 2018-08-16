package com.khd.jejulantis.admin.run.Service;

import java.util.List;

import com.khd.jejulantis.model.Admin;
import com.khd.jejulantis.model.Manager;

public interface RunService {

	List<Admin> adminListService(String manager_id);
	List<Admin> adminListService();
}
