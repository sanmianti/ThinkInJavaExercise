package test;

import java.util.Arrays;

public class ArrayInit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = {new Integer(1), new Integer(2), 3};
		Integer[] b = new Integer[]{new Integer(1), new Integer(2), 3};
		Integer[] c;
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
	}

}
