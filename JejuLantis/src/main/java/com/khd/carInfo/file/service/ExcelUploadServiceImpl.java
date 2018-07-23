package com.khd.carInfo.file.service;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.carInfo.file.util.ExcelRead;
import com.khd.carInfo.file.util.ExcelReadOption;
import com.khd.carInfo.file.dao.*;

@Service
public class ExcelUploadServiceImpl implements ExcelUploadService {
	
	@Autowired
	ExcelUploadDao excelUploadDao;

	@Override
	    public boolean excelUpload(File destFile) throws Exception{
	        ExcelReadOption excelReadOption = new ExcelReadOption();
	        excelReadOption.setFilePath(destFile.getAbsolutePath());
	        excelReadOption.setOutputColumns("A","B","C","D","E","F","G");
	        excelReadOption.setStartRow(2);
	        
	        List<Map<String, String>>excelContent = ExcelRead.read(excelReadOption);
	        
	 return excelUploadDao.excelUpload(excelContent);
	}
}
