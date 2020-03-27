package OOPS;


public class Singleton {
	
	private static Singleton obj;
	

	private Singleton() {
		System.out.println("inside constructor");
	}
	
	public static Singleton getInstance() {
		System.out.println("INside get Instance");
		if(obj==null)
			obj = new Singleton();
		return obj;
	}
	
	public void testme() {
		System.out.println("Inside Test Me");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Singleton st = new Singleton();
		st.testme();
	}

}
