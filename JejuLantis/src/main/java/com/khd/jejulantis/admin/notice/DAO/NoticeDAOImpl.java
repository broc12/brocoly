package com.khd.jejulantis.admin.notice.DAO;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khd.jejulantis.model.Notice;

@Repository
public class NoticeDAOImpl implements NoticeDAO{
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String ns = "query.notice";
	
	
	@Override
	public List<Notice>totallist(){
		List<Notice>totallist = sqlSession.selectList(ns+".myTotalNotice");
		return totallist;
	}
	@Override
	public void delete(long announce_no) {
		sqlSession.delete(ns+".myDelete",announce_no);
	}
	@Override
	public void insert(Notice notice) {
		sqlSession.insert(ns+".myInsert",notice);
	}
	
	@Override
	public List<Notice>update(long announce_no){
		List<Notice>update = sqlSession.selectList(ns+".myUpdate",announce_no);
		return update;
	}
	@Override
	public void modify(Notice notice) {
		sqlSession.update(ns+".myModify",notice);
	}
	

}
