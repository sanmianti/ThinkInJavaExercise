package unit15;

public class ThreeTuple<A, B, C> extends TwoTuple<A, B>{
	public final C third;
	public ThreeTuple(A a, B b, C c) {
		// TODO Auto-generated constructor stub
		super(a, b);
		third = c;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + first + ", " + second + ", " + third +  ")";
	}
}
