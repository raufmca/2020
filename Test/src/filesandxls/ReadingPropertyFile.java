package filesandxls;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertyFile {

	public static void main(String[] args) throws IOException {
		
		System.out.println("User Dirictory -> "+ System.getProperty("user.dir"));
		Properties prop = new Properties();
		
		FileInputStream fn = new FileInputStream(System.getProperty("user.dir")+"\\src\\filesandxls\\Employee.properties");

		prop.load(fn);
		
		System.out.println("Reading the employee files ");
		
		System.out.println("Name -> " + prop.getProperty("Name"));
		System.out.println("Age -> " + prop.getProperty("Age"));
		System.out.println("Class -> " + prop.getProperty("Class"));
	}

}
