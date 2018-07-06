package com.khd.rentcarService;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khd.model.RentcarSearchResult;

@Repository
public class RentcarDAOImpl implements RentcarDAO {

	String ns = "query.rentcar";
	@Autowired
	SqlSessionTemplate sqlsession;
	
	@Override
	public List<RentcarSearchResult> search() {
		return sqlsession.selectList(ns+".rentcarSearch");
	}

}
