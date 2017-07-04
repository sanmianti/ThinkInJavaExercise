package unit10;

public class DotThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DotThis dt = new DotThis();
		DotThis.Inner dti = dt.inner();
		dt.f();
		dti.outer().f();
	}

	void f(){
		System.out.println("DotThis.f()");
	}
	public class Inner{
		public DotThis outer(){
			return DotThis.this;
		}
	}
	public Inner inner(){
		return new Inner();
	}
}
