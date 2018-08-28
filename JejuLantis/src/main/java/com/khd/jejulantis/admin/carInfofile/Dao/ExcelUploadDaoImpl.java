package com.khd.jejulantis.admin.carInfofile.Dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ExcelUploadDaoImpl implements ExcelUploadDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	private String ns = "query.carInfo";
	
	@Override
	public boolean excelUpload(List<Map<String, String>> excelContent) {
		System.out.println("excel content ������ : "+excelContent.size());
		System.out.println(excelContent.get(0).toString());
		HashMap<String,List> h = new HashMap<String,List>();
		h.put("excelContent", excelContent);
		long i = sqlSession.insert(ns+".myExcelInsert", h);
		boolean flag;
		if(i>0) flag = true;
		else flag = false;
		return flag;
	}

}
