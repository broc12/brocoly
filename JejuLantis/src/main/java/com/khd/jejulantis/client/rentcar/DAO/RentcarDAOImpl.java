package com.khd.jejulantis.client.rentcar.DAO;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khd.jejulantis.model.Rcar;
import com.khd.jejulantis.model.SearchRequirements;
import com.khd.jejulantis.model.SelectRentcar;

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
	public SelectRentcar confirmrentcar(SearchRequirements requirements) {
		long i = sqlsession.selectOne(ns+".confirmremainder",requirements);		
		SelectRentcar selectRentcar = null;
		if(i>0) {
			selectRentcar = sqlsession.selectOne(ns+".selectCar",requirements);
		}
		return selectRentcar;
	}
	@Override
	public SelectRentcar inputrentcar(SearchRequirements requirements) {
		int i = sqlsession.insert(ns+".inputreserv",requirements);
		System.out.println(i);
		return null;
	}

}
