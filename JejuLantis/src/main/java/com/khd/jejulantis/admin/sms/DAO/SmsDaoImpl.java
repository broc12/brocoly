package com.khd.jejulantis.admin.sms.DAO;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khd.jejulantis.model.Member;
@Repository("SmsDao")
public class SmsDaoImpl implements SmsDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	private String ns_sms = "query.member";
	@Override
	public List<Member> emailSenderList() {
		List<Member> emailSenderList = sqlSession.selectList(ns_sms+".emailSenderList");
		return emailSenderList;
	}
	@Override
	public List<Member> list() {
		List<Member> list = sqlSession.selectList(ns_sms+".emailSender");
		return list;
	}
}
