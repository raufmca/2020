package Interfaces.com;

public class Elephent implements Animal{

	@Override
	public void typeof() {
		System.out.println("Wild Animal");
		
	}

	@Override
	public void foodtype() {
		System.out.println("Elephent is Vegiterian Animal");
		
	}

	@Override
	public void hunt() {
		System.out.println(" Elephent eats grass and fruits not hunts");
		
	}

}
