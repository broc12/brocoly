package com.khd.carInfo.file.dao;

import java.util.List;
import java.util.Map;

public interface ExcelUploadDao {
	public boolean excelUpload(List<Map<String, String>>excelContent);
}
