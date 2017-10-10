package unit15;

public class FourTuple<A, B, C, D> extends ThreeTuple<A, B, C>{
	public final D fourth;
	public FourTuple(A a, B b, C c, D d) {
		// TODO Auto-generated constructor stub
		super(a, b, c);
		fourth = d;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + first + ", " + second + ", " + third + ", " + fourth + ")";
	}
}
