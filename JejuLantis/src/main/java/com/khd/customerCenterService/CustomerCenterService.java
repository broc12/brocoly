package com.khd.customerCenterService;

import com.khd.model.*;
import java.util.*;

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
