package com.khd.jejulantis.admin.run.Service;

import java.util.List;

import com.khd.jejulantis.model.Admin;
import com.khd.jejulantis.model.Manager;

public interface RunService {

	List<Admin> adminListService(String manager_id);
	List<Admin> adminListService();
	void adminApproveDeleteSelect(long manager_no);
	List<Admin> adminApproveContentSelect(long manager_no);
	void adminApproveUpdateSelect(Admin admin);

}
