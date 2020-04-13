package collections;

import java.io.IOException;

public class TestXLS {

	public static void main(String[] args) throws IOException {
		
		BaseClass bc = new BaseClass("C:\\Testing\\2020\\Test\\src\\filesandxls\\TestCase.xlsx");
		
		int rnum = bc.getRowCount("Feature1");
		
		System.out.println("Number of Rows -> " + rnum);
		
		System.out.println("Number of Columns -> " + bc.getColumnCount("Feature2"));
		
		System.out.println("Cell Data at Sheet1 row,4, Col Name -> " + bc.getCellData("Feature1", 4, "TestCaseTitle"));
	}

}
