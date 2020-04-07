package Interfaces.com;

public class Cat implements Animal{

	@Override
	public void typeof() {
		System.out.println("Cat is domestic animal");
		
	}

	@Override
	public void foodtype() {
		System.out.println("Cat is both veg and non veg animal");
		
	}

	@Override
	public void hunt() {
		System.out.println("Cat hunts rats");
		
	}
	
	public void meow() {
		System.out.println(" Cat meowing");
	}

}
