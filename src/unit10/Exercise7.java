package unit10;

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test7 test7 = new Test7();
		test7.h();
	}

}

class Test7{
	private int i = 1;;
	private void f(){
		System.out.println("Test7.f()");
	}
	void h(){
		Inner inner = new Inner();
		inner.g();
		
	}
	class Inner{
		void g(){
			i = 10;
			f();
			System.out.println("i = " + i);
		}
	}
	
}