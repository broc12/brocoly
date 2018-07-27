package com.khd.jejulantis.admin.notice.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.jejulantis.admin.notice.DAO.NoticeDAO;
import com.khd.jejulantis.model.Notice;

@Service
public class NoticeServiceImpl implements NoticeService{
	@Autowired
	private NoticeDAO noticeDAO;
	
	@Override
	public List<Notice>totallistService(){
		return noticeDAO.totallist();
	}
	@Override
	public void deleteService(long announce_no) {
		noticeDAO.delete(announce_no);
	}
	@Override
	public void insertService(Notice notice) {
		noticeDAO.insert(notice);
	}

	@Override
	public List<Notice>updateService(long announce_no){
		return noticeDAO.update(announce_no);
	}
	@Override
	public void modifyService(Notice notice) {
		noticeDAO.modify(notice);
	}

}
