package unit11;

import java.util.Arrays;

public class ArrayIsNotIterable {
	
	static <T> void test(Iterable<T> ib){
		for (T t : ib) {
			System.out.print(t + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(Arrays.asList(1, 2, 3));
		String[] strings = {"A", "B", "C"};
//		test(strings);
		test(Arrays.asList(strings));
	}

}
