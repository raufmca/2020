package Interfaces.com;

public class TestInterface {

	public static void main(String[] args) {
	
			Cat c = new Cat();
			
			c.hunt();
			c.typeof();
			c.foodtype();
			
			System.out.println("---------------Elepehent objects----------");

			Elephent e = new Elephent();
			e.foodtype();
			e.hunt();
			e.typeof();
			
			//Animal a = new Animal(); // Not allowed creating object of interface
			
			System.out.println("------------ Interfact refernce to the Cat class -----");
			Animal a1 = new Cat();
			a1.hunt();
			a1.foodtype();
			a1.typeof();
			
	}
	

}