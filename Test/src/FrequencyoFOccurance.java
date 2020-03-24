
import java.util.Arrays;
import java.util.HashMap;

public class FrequencyoFOccurance {

	public static void main(String[] args) {
		
		int ar[] = {1,2,3,1,2,3,5,6,7,8,9,5,6,7};
		
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		
		for ( int i: ar) {
			if( map.containsKey(i))
				map.put(i, map.get(i)+1);
			else
				map.put(i, 1);
		}
		
		System.out.println("Arrays list -> "+ Arrays.toString(ar));
		System.out.println("Result -> "+ map);
	}

}
