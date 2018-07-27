package com.khd.jejulantis.client.qna.Service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.jejulantis.client.qna.DAO.CustomerCenterDao;
import com.khd.jejulantis.model.CustomerCenter;
import com.khd.jejulantis.model.Qna;

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
	public boolean qnaDel(long qna_no) {
		return customerCenterDao.qnaDel(qna_no);
	}
	@Override
	public long groupNum() {
		return customerCenterDao.groupNum();
	}
	@Override
	public boolean replyInsert(Qna qna) {
		return customerCenterDao.replyInsert(qna);
	}
	public void replyUpdate(long qna_group) {
		customerCenterDao.replyUpdate(qna_group);
	}
	
}
