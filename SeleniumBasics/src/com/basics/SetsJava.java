package com.basics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetsJava {

	public static void main(String[] args) {


		Set<String> s = new HashSet<String>();
		
		System.out.println("----" + s.size());

		s.add("Alhaam");
		s.add("Aqdas");
		s.add("Shamsunnisa");
		s.add("Rouf");
		
		System.out.println("----- "+ s.size());
		
		Iterator<String> it = s.iterator();
		
		while(it.hasNext()) {
			System.out.println("-- " + it.next());
		}
		
		

	}

}
