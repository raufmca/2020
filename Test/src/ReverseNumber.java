
public class ReverseNumber {

	public static void main(String[] args) {
		
		int num = 12345;
		int num1 = 123455678;
		
		System.out.println(" Reverse of "+num+" -> "+ reverseNum(num));
		System.out.println(" Reverse of "+num1+" -> "+ reverseNum(num1));
	}
	
	static int reverseNum(int n) {
		int rev = 0, rem = 0;
		
		while( n != 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n /= 10;
		}
		
		return rev;
	}

}
