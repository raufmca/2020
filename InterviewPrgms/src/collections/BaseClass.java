package collections;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BaseClass {
	
	public String path;
	public FileInputStream fis = null;
	private XSSFWorkbook workbook = null;
	private XSSFSheet sheet = null;
	private XSSFRow row   =null;
	private XSSFCell cell = null;
	
	
	public BaseClass(String path) throws IOException {
		this.path = path;
		
		fis = new FileInputStream(path);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);
		fis.close();
		
	}
	
	// is sheet exists
	
	public boolean isSheetExists(String sheetName) {
		int index = workbook.getSheetIndex(sheetName);
		
		if ( index == -1 )
			return false;
		else
			return true;
	
	}
	
	// get the row count
	
	public int getRowCount(String sheetName) {
		int index = workbook.getSheetIndex(sheetName);
		
		if (index == -1)
			return 0;
		sheet = workbook.getSheetAt(index);
		int number = sheet.getLastRowNum()+1;
		return number;
		
	}
	
	// get column count
	
	public int getColumnCount(String sheetName) {
		//check is sheet exists 
		
		if (!isSheetExists(sheetName))
			return -1;
		
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(0);
		
		if (row == null)
			return -1;
		
		return row.getLastCellNum();
			
	}
	
	//get the cell data 
	
	public String getCellData(String sheetName, int rowNum, String colNum) {
		
		String cellText = "" ;
		if (!isSheetExists(sheetName))
			return "";
		
		if ( rowNum <=0 )
			return "";
		
		if ( colNum == null)
			return "";
		
		int index = workbook.getSheetIndex(sheetName);
		sheet = workbook.getSheetAt(index);
		row = sheet.getRow(rowNum-1);
		
		//cell = row.getCell(cellnum);
		
		System.out.println("--------------");
		
		if (row == null)
			return "";
		
		
		
		if (cell == null)
			return "";
		
		if (cell.getCellType() == CellType.STRING) {
				System.out.println("@@@@");
				cellText = cell.getStringCellValue();
		}
		return cellText;
	}
	
}

