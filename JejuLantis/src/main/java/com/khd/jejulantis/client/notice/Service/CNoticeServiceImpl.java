package com.khd.jejulantis.client.notice.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.jejulantis.client.notice.DAO.CNoticeDAO;
import com.khd.jejulantis.model.Notice;

@Service
public class CNoticeServiceImpl implements CNoticeService{
	@Autowired
	private CNoticeDAO noticeDAO;
	
	@Override
	public List<Notice>listService(){
		return noticeDAO.list();
	}
	
	@Override
	public List<Notice>toplistService(){
		return noticeDAO.toplist();
	}
	
	@Override
	public List<Notice>subjectService(long announce_no){
		noticeDAO.hitPost(announce_no);
		return noticeDAO.subject(announce_no);
	}
}
