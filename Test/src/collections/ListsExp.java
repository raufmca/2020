package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class ListsExp {

	public static void main(String[] args) {
		
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(100);
		ls.add(200);
		
		Queue<Integer> q = new PriorityQueue<Integer>();
		
		q.add(500);
		q.add(600);
		q.add(700);
		
		for ( int i = 0; i < q.size(); i++)
			System.out.println(q.poll());
		
		System.out.println(q.size());
	}
	

}
