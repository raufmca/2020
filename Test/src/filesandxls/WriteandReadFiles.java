package filesandxls;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteandReadFiles {

	public static void main(String[] args) throws IOException {
		
		File fn = new File("C:\\Testing\\2020\\TextFile1.txt");
		
		fn.createNewFile();  // Create File 
		
		// For writing to the file 
		
		FileWriter fw = new FileWriter(fn);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("This is my first Line");
		bw.newLine();
		bw.write("This is my second Line");
		bw.newLine();
		bw.write("This is my third Line");
		
		bw.flush();
		
		
		// Reading file 
		
		FileReader fr = new FileReader(fn);
		BufferedReader br = new BufferedReader(fr);
		String line ="";
		
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		

	}

}
