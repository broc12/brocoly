package com.khd.jejulantis.client.rentcar.DAO;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khd.jejulantis.model.Rcar;
import com.khd.jejulantis.model.SearchRequirements;

@Repository
public class RentcarDAOImpl implements RentcarDAO {

	@Autowired
	SqlSessionTemplate sqlsession;
	String n2s = "query.rcar";
	String ns = "query.rentcarSearch";
	
	@Override
	public List<Rcar> rentcarList(SearchRequirements requirements) {
		
		return sqlsession.selectList(ns+".rentcarsearch",requirements);	
	}
	@Override
	public Date currenttimeStamp() {
		return sqlsession.selectOne(n2s+".currenttime");
	}
	@Override
	public Date timeStamp() {
		return sqlsession.selectOne(n2s+".nexttime");
	}
	@Override
	public List<Rcar> confirmrentcar(SearchRequirements requirements) {
		long i = sqlsession.selectOne(ns+".confirmremainder",requirements);
		if(i>0) {
			HashMap<String,Object> map = new HashMap<String,Object>();
			/*Branch branch = sqlsession.selectOne(statement, parameter);
			Car car = sqlsession.selectOne(statement, parameter);
			CarKind cakind = sqlsession.selectOne(statement, parameter);*/
		}
		return null;
	}

}
