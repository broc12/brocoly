package com.khd.jejulantis.admin.notice.DAO;

import java.util.List;

import com.khd.jejulantis.model.Notice;

public interface NoticeDAO {
	List<Notice>totallist();
	void delete(long announce_no);
	void insert(Notice notice);
	List<Notice>update(long announce_no);
	void modify(Notice notice);
	
}
