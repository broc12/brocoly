package com.khd.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.khd.notice.NoticeDAO;
import com.khd.notice.Notice;

@Service
public class NoticeServiceImpl implements NoticeService{
	@Autowired
	private NoticeDAO noticeDAO;
	@Override
	public List<Notice>listService(){
		return noticeDAO.list();
	}
	@Override
	public List<Notice>toplistService(){
		return noticeDAO.toplist();
	}
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
	public List<Notice>subjectService(long announce_no){
		noticeDAO.hitPost(announce_no);
		return noticeDAO.subject(announce_no);
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
