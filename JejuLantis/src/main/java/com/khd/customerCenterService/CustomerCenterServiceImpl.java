package com.khd.customerCenterService;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.customerCenterDAO.CustomerCenterDao;
import com.khd.model.*;

@Service
public class CustomerCenterServiceImpl implements CustomerCenterService {

	@Autowired
	CustomerCenterDao customerCenterDao;
	
	@Override
	public List<CustomerCenter> list(HashMap map) {
		return customerCenterDao.list(map);
	}
	@Override
	public List<Qna> qnaList(HashMap map) {
		return customerCenterDao.qnaList(map);
	}
	@Override
	public List<Qna> qnaAdminList() {
		return customerCenterDao.qnaAdminList();
	}
	@Override
	public Qna qnaContent(long qna_no) {
		return customerCenterDao.qnaContent(qna_no);
	}
	
	@Override
	public long totalNum() {
		return customerCenterDao.totalNum();
	}
	@Override
	public boolean insert(Qna qna) {
		return customerCenterDao.insert(qna);
	}
	@Override
	public long groupNum() {
		return customerCenterDao.groupNum();
	}
}
