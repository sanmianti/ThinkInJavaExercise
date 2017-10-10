package unit15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SixTuple<Integer, Integer, Integer, String, String, String> sixTuple = new SixTuple(1, 2, 3, "a", "b", "c");
		System.out.println(sixTuple);
	}

}
class SixTuple<A, B, C, D, E, F> extends FiveTuple<A, B, C, D, E>{
	public final F sixth;
	public SixTuple(A a, B b, C c, D d, E e, F f) {
		// TODO Auto-generated constructor stub
		super(a, b, c, d, e);
		sixth = f;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + first + ", " + second + ", " + third + ", " + fourth + ", " + fifth + ", " + sixth + ")";
	}
}

