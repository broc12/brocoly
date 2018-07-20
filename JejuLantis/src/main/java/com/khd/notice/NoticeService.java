package com.khd.notice;

import java.util.List;
import com.khd.notice.Notice;

public interface NoticeService {
	
	List<Notice>listService();
	
	List<Notice>toplistService();
	
	List<Notice>totallistService();
	
	void deleteService(String announ_no);
	
	void insertService(Notice notice);
	
	List<Notice>subjectService(String announ_no);
	
	List<Notice>updateService(String announ_no);
	
	void modifyService(Notice notice);
	
}
