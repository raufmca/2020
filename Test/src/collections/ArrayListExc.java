package collections;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayListExc {

	public static void main(String[] args) {
		
		ArrayList<String> ar = new ArrayList<String>();
		
		ar.add("Rouf");
		ar.add("Alhaam");
		ar.add("Shamsunnisa");
		ar.add("Aqdas");
		
		for ( int i =0; i < ar.size(); i++)
			System.out.println(ar.get(i));
		
		Collections.sort(ar); 
		
		System.out.println("-------- After Sorting ");

		for ( int i =0; i < ar.size(); i++)
			System.out.println(ar.get(i));
		
	}

}
