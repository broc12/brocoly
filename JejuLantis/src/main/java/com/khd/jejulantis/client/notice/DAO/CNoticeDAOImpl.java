package com.khd.jejulantis.client.notice.DAO;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khd.jejulantis.model.Notice;

@Repository
public class CNoticeDAOImpl implements CNoticeDAO{
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String ns = "query.notice";
	
	@Override
	public List<Notice>list(){
		List<Notice>list =  sqlSession.selectList(ns+".myNotice");
		return list;
	}
	@Override
	public List<Notice>toplist(){
		List<Notice>toplist = sqlSession.selectList(ns+".myTopNotice");
		return toplist;
	}
	@Override
	public List<Notice>subject(long announce_no){
		List<Notice>subject = sqlSession.selectList(ns+".mySubject",announce_no);
		return subject;
	}
	@Override
	public void hitPost(long announce_no) {
		sqlSession.update(ns+".myhits",announce_no);
	}
}
