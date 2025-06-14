package com.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AllData {

	public static void main(String[] args) throws Throwable {
		
		
		File f = new File("C:\\Users\\Pc\\eclipse-workspace\\FrameWork\\src\\test\\resources\\TestData.xlsx");
		
        FileInputStream fis = new FileInputStream(f);
		
	    Workbook wb = new XSSFWorkbook(fis);
	    
	    Sheet s = wb.getSheetAt(0);
	    
	    int r = s.getPhysicalNumberOfRows();
	    
	    for (int i=0; i<r; i++) {
	    	Row row = s.getRow(i);
	    	int nowofColumns = row.getPhysicalNumberOfCells();
	    	for(int j = 0; j<nowofColumns; j++) {
	    		
	    	}
			
		}
	    
	    // ii
	    
	    System.out.println("Helllo world");

	}

}
