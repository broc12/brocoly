package com.khd.jejulantis.admin.carInfofile.Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
 
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class ExcelFileType {
    /**
     * 
     * ���������� �о Workbook ��ü�� �����Ѵ�.
     * XLS�� XLSX Ȯ���ڸ� ���Ѵ�.
     * 
     * @param filePath
     * @return
     * 
     */
    public static Workbook getWorkbook(String filePath) {
        
        /*
         * FileInputStream�� ������ ��ο� �ִ� ������
         * �о Byte�� �����´�.
         * 
         * ������ �������� �ʴ´ٸ���
         * RuntimeException�� �߻��ȴ�.
         */
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(filePath);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
        
        Workbook wb = null;
        
        /*
         * ������ Ȯ���ڸ� üũ�ؼ� .XLS ��� HSSFWorkbook��
         * .XLSX��� XSSFWorkbook�� ���� �ʱ�ȭ �Ѵ�.
         */
        if(filePath.toUpperCase().endsWith(".XLS")) {
            try {
                wb = new HSSFWorkbook(fis);
            } catch (IOException e) {
                throw new RuntimeException(e.getMessage(), e);
            }
        }
        else if(filePath.toUpperCase().endsWith(".XLSX")) {
            try {
                wb = new XSSFWorkbook(fis);
            } catch (IOException e) {
                throw new RuntimeException(e.getMessage(), e);
            }
        }
        return wb;
    }
}


