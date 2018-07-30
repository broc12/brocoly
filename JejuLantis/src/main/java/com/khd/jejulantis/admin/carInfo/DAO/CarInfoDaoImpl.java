package com.khd.jejulantis.admin.carInfo.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khd.jejulantis.model.CarInfo;

@Repository
public class CarInfoDaoImpl implements CarInfoDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String ns = "query.carInfo";

	/*@Override
	public List<CustomerCenter> list(HashMap map) {
		List<CustomerCenter> list = sqlSession.selectList(ns+".mySelectAll",map);
		return list;
	}*/
	@Override
	public boolean carInsert(List<CarInfo> car) {
		Map< String, List<CarInfo> > carMap = new HashMap<String, List<CarInfo>>();
		carMap.put("car", car);
		System.out.println("size : "+car.size());
		int i = sqlSession.insert(ns+".myInsert", carMap);
		System.out.println("I size " +i );
		boolean flag;
		if(i>0) flag = true;
		else flag = false;
		return flag;
	}
	/*@Override
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
	}*/

}
