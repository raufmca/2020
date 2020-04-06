package interviewQuestions;

public class Overload {

	int x;
	double y;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overload o = new Overload();
		
		int a = 2;
		double b = 3.2;
		
		o.add(a, a);
		o.add(b, b);
		
		System.out.println(" The values of x -> " + o.x);
		System.out.println( " The value of y -> " + o.y);
	

	}
	
	 Overload() {
		this.x = 0;
		this.y = 0;
	}

	void add(int a , int b) {
		x = a+b;
	}
	
	void add(double c , double d) {
		y = c + d;
	}
	
}
