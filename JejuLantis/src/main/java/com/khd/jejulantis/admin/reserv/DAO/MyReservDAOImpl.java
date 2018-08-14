package com.khd.jejulantis.admin.reserv.DAO;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khd.jejulantis.model.CarInfo;
import com.khd.jejulantis.model.CarkindDetail;
import com.khd.jejulantis.model.Reserv;

@Repository
public class MyReservDAOImpl implements MyReservDAO{
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String ns = "query.reserv";
	
	@Override
	public List<Reserv>list(long branch_no){
		List<Reserv>list = sqlSession.selectList(ns+".myBranch",branch_no);
		return list;
	}
	@Override
	public Reserv reservfull(long rent_reserv_no) {
		Reserv res =  sqlSession.selectOne(ns+".myFull",rent_reserv_no);
		return res;
	}
	@Override
	public List<CarInfo>info(long branch_no){
		List<CarInfo>info = sqlSession.selectList(ns+".myInfo",branch_no);
		return info;
	}
	@Override
	public List<CarkindDetail>kind(){
		List<CarkindDetail>kind = sqlSession.selectList(ns+".myKind");
		return kind;
	}
	@Override
	public List<CarInfo>myCarNo(long car_no){
		return sqlSession.selectList(ns+".myCarNo",car_no);
		
	}
}
