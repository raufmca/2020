package interviewQuestions;

public class Overloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Overloading1 o = new Overloading1();
		System.out.println(o.method(100.0, 20));
		System.out.println("Int int -> " + o.method(110, 400));
		System.out.println("Int double -> " + method(100, 350.0));
		System.out.println("double double -> " + method(300.0, 500.0));
	}
	
	int method(int i, int d)
	{
	return i+d;
	}

	static int method(int i, double d)
	{
	return (int)(i+d);
	}

	double method(double i, int d)
	{
	return i+d;
	}

	static double method(double i, double d)
	{
	return i+d;
	}

}
