package filesandxls;

public class ReadXLS {

	public static void main(String[] args) {
		
		ReadXLSUtility data = new ReadXLSUtility("C:\\Testing\\2020\\Test\\src\\filesandxls\\TestCase.xlsx");
		
		System.out.println("Number of rows in Feature1 sheet -> " + data.getRowCount("Feature1"));
		

	}

}
