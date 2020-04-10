package interviewQuestions;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" Rervers of 1234 -> " + reverse(1234));
	}

	
	public static int reverse(int num) {
		int rev=0;
		int rem = 0;
		
		while(num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem ;
			num = num / 10;
		}
		
		return(rev);
	}
}
