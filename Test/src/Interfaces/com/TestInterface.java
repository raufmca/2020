package Interfaces.com;

public class TestInterface {

	public static void main(String[] args) {
	
			Cat c = new Cat();
			
			c.hunt();
			c.typeof();
			c.foodtype();
			c.meow();
			
			System.out.println("---------------Elepehent objects----------");

			Elephent e = new Elephent();
			e.foodtype();
			e.hunt();
			e.typeof();
			e.run();
			
			//Animal a = new Animal(); // Not allowed creating object of interface
			
			System.out.println("------------ Interfact refernce to the Cat class -----");
			Animal a1 = new Cat();
			a1.hunt();
			a1.foodtype();
			a1.typeof();
			
			System.out.println("---------- Creating reference to the abstract class-------");
			
			
	}
	

}
