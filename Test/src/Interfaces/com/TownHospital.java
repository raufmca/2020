package Interfaces.com;

public abstract class TownHospital implements Hospital{

	@Override
	public void register() {
		// TODO Auto-generated method stub
		
		System.out.println(" Town Hospital register");
		
	}

	@Override
	public void bodyScan() {
		// TODO Auto-generated method stub
		System.out.println( " Town Hospital body scan facility ");
	}
	
	public void yoga() {
		System.out.println("Town Hospital Yoga department");
	}

	

}
