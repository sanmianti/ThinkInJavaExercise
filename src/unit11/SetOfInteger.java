package unit11;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetOfInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random(47);
		Set<Integer> intset = new HashSet<Integer>();
		for(int i = 0; i < 10000; i++){
			intset.add(random.nextInt(30));
		}
		System.out.println(intset);
	}

}
