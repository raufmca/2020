package OOPS;

public class HondaCar extends Car{
	
	public HondaCar() {
		System.out.println("Inside default HondaCar");
	}
	
	public void gps() {
		System.out.println("HondaCar GPS");
	}
	
	public void refuel() {
		System.out.println("refueling ");
	}
	
	public void refuel(int qty, int time) {
		System.out.println("Inside refueling Honda car in "+time+" Seconds");
		System.out.println("Fuelcapacity is "+fuelcapacity);
		fuelcapacity += qty;
	}
	
	public void refuel(int q) {
		System.out.println(" Refuelling honda car -> "+ q);
	}

}
