package unit10;

public class Exercise18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedClass nc = new NestedClass();
		nc.f();
		NestedClass.f();
	}
	
	public static class NestedClass{
		public static void f(){
			System.out.println("f()");
		}
	}
}
