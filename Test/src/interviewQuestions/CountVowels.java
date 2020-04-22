package interviewQuestions;

public class CountVowels {

	public static void main(String[] args) {

		String str = "Hello this is my string";
		int c =0;
		
		System.out.println("Given String -> " + str);
		str = str.toLowerCase();
		
		
		System.out.println("Number of vowels in the string are -> "+ countVowel(str));
		
	}
	
	public static int countVowel(String str) {
		int count=0;
		for ( int i =0 ; i < str.length(); i++) {
			char ch = str.charAt(i);
				if (ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					count++;
		}
		return count;
	}

}
