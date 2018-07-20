package com.khd.customerCenterDAO;

import java.util.*;
import com.khd.model.*;

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
