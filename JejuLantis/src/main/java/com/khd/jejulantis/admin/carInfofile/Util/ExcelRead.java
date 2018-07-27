package com.khd.jejulantis.admin.carInfofile.Util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
 
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
 
 
 
public class ExcelRead {
     public static List<Map<String, String>> read(ExcelReadOption excelReadOption) {
            //���� ���� ��ü
            //���������� �о� ���δ�.
            //FileType.getWorkbook() <-- ������ Ȯ���ڿ� ���� �����ϰ� �����´�.
            Workbook wb = ExcelFileType.getWorkbook(excelReadOption.getFilePath());
            /**
             * ���� ���Ͽ��� ù��° ��Ʈ�� ������ �´�.
             */
            Sheet sheet = wb.getSheetAt(0);
            
            System.out.println("Sheet �̸�: "+ wb.getSheetName(0)); 
            System.out.println("�����Ͱ� �ִ� Sheet�� �� :" + wb.getNumberOfSheets());
            /**
             * sheet���� ��ȿ��(�����Ͱ� �ִ�) ���� ������ �����´�.
             */
            int numOfRows = sheet.getPhysicalNumberOfRows();
            int numOfCells = 0;
            
            Row row = null;	
            Cell cell = null;
            
            String cellName = "";
            /**
             * �� row������ ���� ������ �� ��ü
             * ����Ǵ� ������ ������ ����.
             * put("A", "�̸�");
             * put("B", "���Ӹ�");
             */
            Map<String, String> map = null;
            /*
             * �� Row�� ����Ʈ�� ��´�.
             * �ϳ��� Row�� �ϳ��� Map���� ǥ���Ǹ�
             * List���� ��� Row�� ���Ե� ���̴�.
             */
            List<Map<String, String>> result = new ArrayList<Map<String, String>>(); 
            /**
             * �� Row��ŭ �ݺ��� �Ѵ�.
             */
            for(int rowIndex = excelReadOption.getStartRow() - 1; rowIndex < numOfRows; rowIndex++) {
                /*
                 * ��ũ�Ͽ��� ������ ��Ʈ���� rowIndex�� �ش��ϴ� Row�� �����´�.
                 * �ϳ��� Row�� �������� Cell�� ������.
                 */
                row = sheet.getRow(rowIndex);
                
                if(row != null) {
                    /*
                     * ������ Row�� Cell�� ������ ���Ѵ�.
                     */
                	numOfCells = row.getLastCellNum();
                    /*
                     * �����͸� ���� �� ��ü �ʱ�ȭ
                     */
                    map = new HashMap<String, String>();
                    /*
                     * cell�� �� ��ŭ �ݺ��Ѵ�.
                     */
                    for(int cellIndex = 0; cellIndex < numOfCells; cellIndex++) {
                        /*
                         * Row���� CellIndex�� �ش��ϴ� Cell�� �����´�.
                         */
                        cell = row.getCell(cellIndex);
                        /*
                         * ���� Cell�� �̸��� �����´�
                         * �̸��� �� : A,B,C,D,......
                         */
                        cellName = ExcelCellRef.getName(cell, cellIndex);
                        /*
                         * ���� ��� �÷����� Ȯ���Ѵ�
                         * ���� ��� �÷��� �ƴ϶��, 
                         * for�� �ٽ� �ö󰣴�
                         */
                        if( !excelReadOption.getOutputColumns().contains(cellName) ) {
                            continue;
                        }
                        /*
                         * map��ü�� Cell�� �̸��� Ű(Key)�� �����͸� ��´�.
                         */
                        map.put(cellName, ExcelCellRef.getValue(cell));
                    }
                    /*
                     * ������� Map��ü�� List�� �ִ´�.
                     */
                    result.add(map);
                    
                }
                
            }
            
            return result;
            
        }
        
        
        
//        public static void main(String[] args) {
//            
//            ExcelReadOption ro = new ExcelReadOption();
//            ro.setFilePath("D:/game.xlsx");
//            ro.setOutputColumns("A", "B");
//            ro.setStartRow(1);
//            
//            List<Map<String, String>> result = ExcelRead.read(ro);
//            
//            for(Map<String, String> map : result) {
//                System.out.println(map.get("A"));
//            }
//        }
}


