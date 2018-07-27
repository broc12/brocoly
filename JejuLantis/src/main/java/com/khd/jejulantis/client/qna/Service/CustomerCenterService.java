package com.khd.jejulantis.client.qna.Service;

import java.util.HashMap;
import java.util.List;

import com.khd.jejulantis.model.CustomerCenter;
import com.khd.jejulantis.model.Qna;

public interface CustomerCenterService {
	List<CustomerCenter> list(HashMap map);
	List<Qna> qnaList(HashMap map);
	List<Qna> qnaAdminList();
	Qna qnaContent(long qna_no);
	long totalNum();
	boolean insert(Qna qna);
	long groupNum();
	boolean replyInsert(Qna qna);
	boolean qnaDel(long qna_no);
	void replyUpdate(long qna_group);
	
}
