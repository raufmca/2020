package Strings;

public class StringFunctions {

	public static void main(String[] args) {
		
		String str1 = "I love my family. We are 6 members in family";
		String str2 = "I love my family. We are 6 members in family";
		String str3 = "I love my family. ";
		
		System.out.println("Length of the string -> " + str1.length());
		System.out.println("Charcter at 10th index -> " + str1.charAt(10));
		
		System.out.println("First occurance of Index of 'f' -> " +str1.indexOf('f') );
		System.out.println("Second occurance of Index of 'f' -> " + str1.indexOf('f', 11));
		
		System.out.println("Love is present in the string -> " + str1.indexOf("Love"));
		
		System.out.println("family is present in the above string -> "+str1.indexOf("family"));

		System.out.println("String1 an String2 are equal? -> " + str1.equalsIgnoreCase(str2));
		
		System.out.println("String1 and String3 are equal? -> " + str1.equals(str3));
		
		System.out.println("Substring from 10th to 16th index -> " + str1.substring(10, 16));
		
		String[] ar = str1.split(" ");
		
		System.out.println("--- Contents after splitting the string -----");
		for ( String str : ar)
				System.out.print("--"+str);
	
	System.out.println();
	// Converting Data Types 
	
	String x = "100";
	
	int y = Integer.parseInt(x);
	
	System.out.println("The String (100) is converted to integer -> " + y);
	
	// converting integer to string
	
	String z = String.valueOf(y);
	
	

}
}