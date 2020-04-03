


import java.util.HashMap;
import java.util.Map.Entry;

public class LoneElement {

	public static void main(String[] args) {

		int[] ar = {1,2,2,3,3,4,4,5,6,7,5,6,7,8,7,3,2,4,6};
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i: ar) {
			if(map.containsKey(i))
				map.put(i, map.get(i)+1);
			else
				map.put(i, 1);
		}

		
		System.out.println("Map details -> "+ map);
		for( Entry<Integer, Integer> entry : map.entrySet())
			if( entry.getValue() <= 1)
				System.out.println("Lone Elent is -> " + entry.getKey());		
		
		
		
		
	}
	
	
	

}
