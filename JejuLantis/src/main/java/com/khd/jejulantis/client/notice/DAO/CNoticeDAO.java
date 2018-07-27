package com.khd.jejulantis.client.notice.DAO;

import java.util.List;

import com.khd.jejulantis.model.Notice;

public interface CNoticeDAO {
	void hitPost(long announce_no);
	List<Notice>list();
	List<Notice>toplist();
	List<Notice>subject(long announce_no);
}
