package com.khd.notice;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class NoticeDAOImpl implements NoticeDAO{
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
	public List<Notice>totallist(){
		List<Notice>totallist = sqlSession.selectList(ns+".myTotalNotice");
		return totallist;
	}
	@Override
	public void delete(String announ_no) {
		sqlSession.delete(ns+".myDelete",announ_no);
	}
	@Override
	public void insert(Notice notice) {
		sqlSession.insert(ns+".myInsert",notice);
	}
	@Override
	public List<Notice>subject(String announ_no){
		List<Notice>subject = sqlSession.selectList(ns+".mySubject",announ_no);
		return subject;
	}
	@Override
	public List<Notice>update(String announ_no){
		List<Notice>update = sqlSession.selectList(ns+".myUpdate",announ_no);
		return update;
	}
	@Override
	public void modify(Notice notice) {
		sqlSession.update(ns+".myModify",notice);
	}
	@Override
	public void hitPost(String announ_no) {
		sqlSession.update(ns+".myCount",announ_no);
	}

}
