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
	public void deleteService(String announ_no) {
		noticeDAO.delete(announ_no);
	}
	@Override
	public void insertService(Notice notice) {
		noticeDAO.insert(notice);
	}
	@Override
	public List<Notice>subjectService(String announ_no){
		noticeDAO.hitPost(announ_no);
		return noticeDAO.subject(announ_no);
	}
	@Override
	public List<Notice>updateService(String announ_no){
		return noticeDAO.update(announ_no);
	}
	@Override
	public void modifyService(Notice notice) {
		noticeDAO.modify(notice);
	}

}
