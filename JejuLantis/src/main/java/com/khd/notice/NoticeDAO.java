package com.khd.notice;

import java.util.List;
import com.khd.notice.Notice;

public interface NoticeDAO {
	List<Notice>list();
	List<Notice>toplist();
	List<Notice>totallist();
	void delete(long announce_no);
	void insert(Notice notice);
	List<Notice>subject(long announce_no);
	List<Notice>update(long announce_no);
	void modify(Notice notice);
	void hitPost(long announce_no);
}
