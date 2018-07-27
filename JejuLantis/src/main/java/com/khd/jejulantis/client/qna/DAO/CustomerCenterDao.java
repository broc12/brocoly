package com.khd.jejulantis.client.qna.DAO;

import java.util.HashMap;
import java.util.List;

import com.khd.jejulantis.model.CustomerCenter;
import com.khd.jejulantis.model.Qna;

public interface CustomerCenterDao {
	List<CustomerCenter> list(HashMap map); 
	List<Qna> qnaAdminList();
	List<Qna> qnaList(HashMap map);
	Qna qnaContent(long qna_no);
	long totalNum();
	boolean insert(Qna qna);
	boolean replyInsert(Qna qna);
	boolean qnaDel(long qna_no);
	long groupNum();
	void replyUpdate(long qna_group);
}
