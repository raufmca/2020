package filesandxls;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadXLSUtility {

		public static String filepath = System.getProperty("user.dir")+"\\src\\filesandxls\\TestCase.xlsx";
		public String path;
		public FileInputStream fis = null;
		public FileOutputStream fos = null;
		private XSSFWorkbook workbook = null;
		public XSSFSheet sheet = null;
		public XSSFRow row = null;
		public XSSFCell cell = null;
	
	
	public ReadXLSUtility(String path) {
		this.path = path;
		
		try {
			System.out.println("---------" + path);
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheetAt(0);
			fis.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	// returns row count 
	
	public int getRowCount(String sheetName) {
		int index = workbook.getSheetIndex(sheetName);
		
		if ( index == -1 )
			return 0;
		else {
			sheet = workbook.getSheetAt(index);
			int number = sheet.getLastRowNum()+1;
			return number;
		}
	}
	
	// return column counts 
	
	public int getColumnCount(String sheetName) {
		if ( !isSheetExists(sheetName))
			return -1;
		
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(0);
		
		if ( row == null)
			return -1;
		return row.getLastCellNum();
	}
	
	//Find sheet exists 
	
	public boolean isSheetExists(String sheetName) {
		int index = workbook.getSheetIndex(sheetName);
		
		if ( index == -1) 
			return false;
		else
			return true;
		}
	}

