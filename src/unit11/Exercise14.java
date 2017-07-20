package unit11;

import java.util.LinkedList;
import java.util.ListIterator;

public class Exercise14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		ListIterator<Integer> li = linkedList.listIterator();
		
		for(int i = 1; i <= 10; i++){
			li.add(i);
			if (i % 2 == 0) {
				li.previous();
			}
		}
		
		System.out.println(linkedList);
		
//		for(int i = 0; i < 10; i++){
//			int insertIndex = linkedList.size() / 2;
//			linkedList.add(insertIndex, i);
//		}
//		
//		System.out.println(linkedList);
	}

}
