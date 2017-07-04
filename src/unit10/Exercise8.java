package unit10;

public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test8 test8 = new Test8();
		test8.f();
	}

}
class Test8{
	class Inner{
	
		private int i = 10;
		private void show(){
			System.out.println(i);
		}
	}
	
	void f(){
		Inner inner = new Inner();
		inner.i = 20;
		inner.show();
	}
}