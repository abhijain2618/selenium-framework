package com.openselenium.selenium.utility;


import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelUtil {

	public XSSFWorkbook excelWorkBook; // for .xlsx extension 
	// public HSSFWorkbook excelWorkBook; for .xls extension 
	public XSSFSheet excelSheet;
	public XSSFCell cell;
	public XSSFRow row;
	
	
	public void setExcelFile(String path , String sheetName) throws Exception{
		FileInputStream inputStream = new FileInputStream(path);
		excelWorkBook = new XSSFWorkbook(inputStream);
		excelSheet = excelWorkBook.getSheet(sheetName);
	}
	
	public String getCellValue (int row, int column){
		try {
			cell = excelSheet.getRow(row).getCell(column);
			String cellValue = cell.getStringCellValue();
			return cellValue;
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}
	
	public void setCellValue(String value , int rowIndex, int columnIndex){
		row = excelSheet.getRow(rowIndex);
		cell = row.getCell(columnIndex, row.CREATE_NULL_AS_BLANK);
		cell.setCellValue(value);
	}
	
	public void saveExcelFile(String path) throws Exception{
		FileOutputStream fileOutputStream = new FileOutputStream(path);
		excelWorkBook.write(fileOutputStream);
		fileOutputStream.flush();
		fileOutputStream.close();
	}

}

