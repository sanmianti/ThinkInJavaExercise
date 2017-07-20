package unit11;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetOfInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random(47);
		SortedSet<Integer> intset = new TreeSet<Integer>();
		for(int i = 0; i < 10000; i++)
			intset.add(random.nextInt(30));
		System.out.println(intset);
	}	

}
