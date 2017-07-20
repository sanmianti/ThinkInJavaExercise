package unit11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ModifyingArraysAsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random(25);
		Integer[] integerArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		List<Integer> integerList = new ArrayList<>(Arrays.asList(integerArray));
		System.out.println("Before shuffling: " + integerList);
		Collections.shuffle(integerList, random);
		System.out.println("After shuffling: " + integerList);
		System.out.println("integerArray:" + Arrays.toString(integerArray));
		List<Integer> integerList2 = Arrays.asList(integerArray);
		Collections.shuffle(integerList2);
		System.out.println("integerArray: " + Arrays.toString(integerArray));
	}

}
