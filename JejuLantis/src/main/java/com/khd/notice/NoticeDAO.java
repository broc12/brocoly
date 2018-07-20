package com.khd.notice;

import java.util.List;
import com.khd.notice.Notice;

public interface NoticeDAO {
	List<Notice>list();
	List<Notice>toplist();
	List<Notice>totallist();
	void delete(String announ_no);
	void insert(Notice notice);
	List<Notice>subject(String announ_no);
	List<Notice>update(String announ_no);
	void modify(Notice notice);
	void hitPost(String announ_no);
}
