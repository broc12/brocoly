package com.khd.jejulantis.admin.chart.DAO;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class ChartDAOImpl implements ChartDAO{
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String ns = "query.chart";
	
	@Override
	public HashMap chart() {
		List cha = sqlSession.selectList(ns+".myAug");
		List last = sqlSession.selectList(ns+".myLast");
		List newbie = sqlSession.selectList(ns+".myNewbie");
		List byebie = sqlSession.selectList(ns+".myByebie");
		HashMap map = new HashMap ();
		map.put("reserv", cha);
		map.put("last", last);
		map.put("bie", newbie);
		map.put("bye",byebie);
		return map;
	}
	
	@Override
	public HashMap finish(long branch_no) {
		HashMap branch = new HashMap();
		branch.put("branch_no", branch_no);
		List bug = sqlSession.selectList(ns+".myBug",branch);
		List cha = sqlSession.selectList(ns+".myCug",branch);
		List wek = sqlSession.selectList(ns+".myWeek",branch);
		List pie = sqlSession.selectList(ns+".myPie",branch);
		HashMap map = new HashMap();
		map.put("bug", bug);
		map.put("cha", cha);
		map.put("wek", wek);
		map.put("pie", pie);
		return map;
	}
}
