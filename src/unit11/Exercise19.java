package unit11;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Exercise19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//first, use the HashSet
		Set<Integer> hashtSet = new HashSet<Integer>();
		for(int i = 0; i < 10 ; i++){
			hashtSet.add(i);
		}
		System.out.println(hashtSet);
		
		//Second, use the LinkedHashSet.
		Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		for(int i = 0; i < 10; i++){
			linkedHashSet.add(i);
		}
		System.out.println(linkedHashSet);
	}

}
