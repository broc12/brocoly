package com.khd.jejulantis.admin.carInfofile.Dao;

import java.util.List;
import java.util.Map;

public interface ExcelUploadDao {
	public boolean excelUpload(List<Map<String, String>>excelContent);
}
