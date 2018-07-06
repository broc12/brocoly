package com.khd.customerCenterDAO;

import java.util.*;
import com.khd.model.*;

public interface CustomerCenterDao {
	List<CustomerCenter> list(HashMap map); 
	List<Qna> qnaList(HashMap map);
	Qna qnaContent(long qna_no);
	long totalNum();
	boolean insert(Qna qna);
	long groupNum();
}
