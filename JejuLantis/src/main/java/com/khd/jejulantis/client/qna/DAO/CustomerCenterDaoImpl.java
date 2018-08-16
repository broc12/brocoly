package com.khd.jejulantis.client.qna.DAO;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khd.jejulantis.model.CustomerCenter;
import com.khd.jejulantis.model.Qna;

@Repository
public class CustomerCenterDaoImpl implements CustomerCenterDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String ns = "query.CustomerCenter";
	private String nsQna = "query.Qna";

	@Override
	public List<CustomerCenter> list(HashMap map) {
		List<CustomerCenter> list = sqlSession.selectList(ns+".mySelectAll",map);
		return list;
	}
	@Override
	public List<Qna> qnaList(HashMap map) {
		List<Qna> qnaList = sqlSession.selectList(nsQna+".myQnaSelectAll",map);
		return qnaList;
	}
	@Override
	public List<Qna> qnaAdminList() {
		List<Qna> qnaList = sqlSession.selectList(nsQna+".myAdminSelectAll");
		System.out.println("qna ������"+ qnaList.size());
		return qnaList;
	}
	@Override
	public Qna qnaContent(long qna_no) {
		Qna qna = sqlSession.selectOne(nsQna+".myQnaSelectOne",qna_no);
		return qna;
	}
	
	@Override
	public long totalNum() {
		Long totalNum = sqlSession.selectOne(nsQna+".myTotalNum");
		totalNum = totalNum == null ? 0 : totalNum;
		return totalNum;
	}
	@Override
	public boolean insert(Qna qna) {
		int i = sqlSession.insert(nsQna+".myInsert", qna);
		boolean flag;
		if(i>0) flag = true;
		else flag = false;
		return flag;
	}
	@Override
	public long groupNum() {
		Long groupNum = sqlSession.selectOne(nsQna+".myGroupNum");
		if(groupNum==null) return 0;
		return groupNum;
	}
	@Override
	public boolean replyInsert(Qna qna) {
		int i = sqlSession.insert(nsQna+".myReplyInsert", qna);
		boolean flag;
		if(i>0) flag = true;
		else flag = false;
		return flag;
	}
	@Override
	public boolean qnaDel(long qna_no) {
		int i = sqlSession.delete(nsQna+".myQnaDel", qna_no);
		boolean flag;
		if(i>0) flag = true;
		else flag = false;
		return flag;
	}
	@Override
	public void replyUpdate(long qna_group) {
		sqlSession.update(nsQna+".myReplyUpdate", qna_group);
	}

}
