package unit11;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Exercise12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++){
			list1.add(i);
			list2.add(i);
		}
		
		ListIterator<Integer> it = list1.listIterator(list1.size());
		while (it.hasPrevious()) {
			list2.add(it.previous());
		}
		System.out.println(list2);
	}

}
