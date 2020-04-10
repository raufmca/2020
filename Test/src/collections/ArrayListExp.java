package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExp {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Alhaam", 5, "Sports");
		Employee e2 = new Employee("Aqdas" , 1 , "Playing");
		Employee e3 = new Employee("Shamsunnisa", 32, "Testing");
		Employee e4 = new Employee("Rouf", 35, "Automation");
		
		
		ArrayList<Employee> emp = new ArrayList<Employee>();
		
		emp.add(e4);
		emp.add(e3);
		emp.add(e1);
		emp.add(e2);
		
		Iterator<Employee> e = emp.iterator();
		
		while(e.hasNext()){
		
			Employee ee = e.next();
			System.out.println(" Name -> " + ee.name + " Age -> " + ee.age + " Dept -> "+ ee.dept);
			
		}
		
	}

}
