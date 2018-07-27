package com.khd.jejulantis.client.notice.Service;

import java.util.List;

import com.khd.jejulantis.model.Notice;

public interface CNoticeService {
	
	List<Notice>listService();
	
	List<Notice>toplistService();
	
	List<Notice>subjectService(long announce_no);
}
