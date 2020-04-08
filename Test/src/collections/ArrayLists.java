package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add("Alhaam");
		al.add("Aqdas");
		al.add("Shamsunnisa");
		al.add("Rouf");
		
		System.out.println("Size of arryList -> "+al.size());
		
		System.out.println("Arra Elements ---------");
		for ( int i=0; i< al.size(); i++)
			System.out.println(al.get(i));
		
		System.out.println("--------------Making specific arraysList----------");

		ArrayList<String> ls = new ArrayList<String>();
		
		ls.add("Rouf");
		ls.add("Shamsunnisa");
		ls.add("Alhaam");
		ls.add("Aqdas");
		
		Iterator it = ls.iterator();
		
		while(it.hasNext()) {
			System.out.println("-- "+it.next());
		}
	}

}
