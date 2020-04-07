package Interfaces.com;

public class CityHospital extends TownHospital{

	@Override
	public void operate() {
		System.out.println("City Hospital Operation theater");
		
	}

	@Override
	public void emergency() {
		// TODO Auto-generated method stub
		System.out.println("City Hospital Emergency department");
	}

}
