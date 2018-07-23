package com.khd.notice;

import java.util.List;
import com.khd.notice.Notice;

public interface NoticeService {
	
	List<Notice>listService();
	
	List<Notice>toplistService();
	
	List<Notice>totallistService();
	
	void deleteService(long announce_no);
	
	void insertService(Notice notice);
	
	List<Notice>subjectService(long announce_no);
	
	List<Notice>updateService(long announce_no);
	
	void modifyService(Notice notice);
	
}
