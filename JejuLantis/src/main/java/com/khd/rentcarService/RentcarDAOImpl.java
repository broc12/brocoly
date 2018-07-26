package com.khd.rentcarService;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khd.model.Rcar;
import com.khd.model.SearchRequirements;

@Repository
public class RentcarDAOImpl implements RentcarDAO {

	@Autowired
	SqlSessionTemplate sqlsession;
	String ns = "query.rcar";
	
	@Override
	public List<Rcar> rentcarList(SearchRequirements requirements) {
		
		return sqlsession.selectList(ns+".selectCarList",requirements);	
	}
	@Override
	public Date currenttimeStamp() {
		return sqlsession.selectOne(ns+".currenttime");
	}
	@Override
	public Date timeStamp() {
		return sqlsession.selectOne(ns+".nexttime");
	}

}
