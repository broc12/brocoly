package com.khd.jejulantis.admin.notice.Service;

import java.util.List;

import com.khd.jejulantis.model.Notice;

public interface NoticeService {
	
	List<Notice>totallistService();
	
	void deleteService(long announce_no);
	
	void insertService(Notice notice);
	
	
	List<Notice>updateService(long announce_no);
	
	void modifyService(Notice notice);
	
}
