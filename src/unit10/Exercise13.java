package unit10;

public class Exercise13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise13 e13 = new Exercise13();
		e13.getTest13().f();
	}

	public ITest13 getTest13(){
		return new ITest13() {
			
			@Override
			public void f() {
				// TODO Auto-generated method stub
				System.out.println("f()");
			}
		};
	}
}

interface ITest13{
	void f();
}