package unit11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random(47);
		
		List<Integer> integers = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++){
			integers.add(new Integer(i));
		}
		System.out.println("1: " + integers);
		Integer i1 = new Integer(0);
		integers.add(i1);
		System.out.println("2: " + integers);
		System.out.println("3: " + integers.contains(i1));
		
		integers.remove(i1);
		System.out.println(integers);
		Integer i2 = integers.get(2);
		System.out.println("4: " + i2 + " " + integers.indexOf(i2));
		Integer i3 = new Integer(2);
		System.out.println("5: " + integers.indexOf(i3));
		System.out.println("6: " + integers.remove(i3));
		System.out.println(integers);
		
		System.out.println("7: " + integers.remove(i2));
		System.out.println("8: " + integers);
		integers.add(3, new Integer(3));
		System.out.println("9: " + integers);
		List<Integer> sub = integers.subList(1, 4);
		System.out.println("subList: " + sub);
		System.out.println("10: " + integers.containsAll(sub));
		Collections.sort(sub);
		System.out.println("sorted subList: " + sub);
		System.out.println("11: " + integers.containsAll(sub));
		System.out.println(integers);
		Collections.shuffle(sub, rand);
		System.out.println("shuffled subList: " + sub);
		System.out.println("12: " + integers.containsAll(sub));
		
		List<Integer> copy = new ArrayList<Integer>(integers);
		sub = Arrays.asList(integers.get(1), integers.get(4));
		System.out.println("sub: " + sub);
		System.out.println(copy);
		copy.retainAll(sub);
		System.out.println("13: " + copy);
		copy = new ArrayList<Integer>(integers);
		copy.remove(2);
		System.out.println("14: " + copy);
		copy.removeAll(sub);
		System.out.println("15: " + copy);
		copy.set(1, new Integer(10));
		System.out.println("16: " + copy);
		copy.addAll(2, sub);
		System.out.println("17: " + copy);
		System.out.println("18: " + integers.isEmpty());
		integers.clear();
		System.out.println("19: " + integers);
		System.out.println("20: " + integers.isEmpty());
		integers.addAll(copy);
		System.out.println("21: " + integers);
		Object[] o = integers.toArray();
		System.out.println("22: " + integers);
		Integer[] pa = integers.toArray(new Integer[0]);
		System.out.println("23: " + pa[3]);
		
		
	}

}
