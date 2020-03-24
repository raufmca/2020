import java.util.HashMap;
import java.util.Map.Entry;

public class TestMap {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		hmap.put(1,"Abdulrouf");
		hmap.put(2,"Shamsunnisa");
		hmap.put(3,"Alhaam");
		hmap.put(4, "Aqdas");
		hmap.put(5, "Bijapur");
		
		System.out.println("Value at 4 - > " + hmap.get(4));
		
		System.out.println("Value at 5 -> " + hmap.get(5));
		
	
	}

}
