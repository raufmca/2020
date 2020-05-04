package Strings;

public class ReverseString {

	public static void main(String[] args) {
		
		String str1 = "Rouf";
		
		if (reverse(str1))
			System.out.println("Palindrom ->" + str1);
		else
			System.out.println("Not palindrom ->" + str1);
		

	}
	
	static boolean reverse(String str) {
		String tmp = str;
		String rev="" ;
		
		for ( int i = str.length()-1; i >=0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("Rev- > " + rev);
		
		if ( rev.equals(str)) 
			return true;
		else
			return false;
					
		
	}

}
