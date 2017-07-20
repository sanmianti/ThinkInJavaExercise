package unit11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class SimpleCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> c = new HashSet<Integer>();
		for(int i = 0; i < 10; i++){
			c.add(i);
		}
		for (Integer integer : c) {
			System.out.println(integer);
		}
	}

}
