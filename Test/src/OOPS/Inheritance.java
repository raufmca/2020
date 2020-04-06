package OOPS;

public class Inheritance {
	
	public static void main(String args[]) {
		
		new Car();
	
		Car c1 = new Car("Base Model", 25);
	
		System.out.println("Fuelcapacity available -> "+ Car.fuelcapacity);
		c1.start();
		c1.refuel();
		c1.refuel(30);
		
		System.out.println("-------------------------");
		
		HondaCar hc = new HondaCar();
		hc.gps();
		hc.refuel();
		hc.refuel(100);
		hc.refuel(20, 20);
		System.out.println("Fuelcapacity available -> "+ HondaCar.fuelcapacity);
		
		
		System.out.println("------------------------------");
		
		Car cc = new HondaCar();
		
		cc.refuel(100);
		cc.refuel();
		
		//Overloading o = new Overloading();

		
	}
}
