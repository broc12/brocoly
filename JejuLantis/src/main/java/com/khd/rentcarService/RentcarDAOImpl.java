package com.khd.rentcarService;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khd.model.RentcarSearchResult;

@Repository
public class RentcarDAOImpl implements RentcarDAO {

	String ns = "query.rcar";
	@Autowired
	SqlSessionTemplate sqlsession;
	
	@Override
	public List search() {
		HashMap<String,String> m = new HashMap<String,String>();
		String car_kind_name = "차종1";
		m.put("car_kind_name", "차종1");
		m.put("car_kind_type", "경유1");
		m.put("car_kind_passenger", "4");
		m.put("car_kind_fuel", "중형");
		return sqlsession.selectList(ns+".selectRcar",car_kind_name);
		
	}

}
