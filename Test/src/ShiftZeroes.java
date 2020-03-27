import java.util.Arrays;

public class ShiftZeroes {

	public static void main(String[] args) {

		int [] ar = {1,0,2,0,3,0,4,0,5,6,7,0,8,9,0};

		System.out.println("Array before move -> " + Arrays.toString(ar));
		pushZeroes(ar);
		System.out.println("Array after move -> " + Arrays.toString(ar));
	}
	
	static void pushZeroes(int ar[]) {
		int size = ar.length, count = 0;
		
		/* Traverse through the array elements , if element encountered is non zero
		 * then replace element at count index with this element*/
		
		for ( int i = 0; i < size; i++)
				if ( ar[i] != 0 )
					ar[count++] = ar[i]; // increment the count after replacing
		
		// Now all zeroes are shifted to front and count is set to index of FIRST 0
		// Make all the elements 0 from count to end
		while(count < size)
			ar[count++] = 0;
		
		
		
	}

}
