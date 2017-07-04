package unit10;

import unit10.WithInner.Inner;

public class InheritInner extends WithInner{

	public InheritInner( ) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args){
		
		InheritInner ii = new InheritInner();
		Inner inner = new WithInner().new Inner();
		Inner inner2 = new InheritInner().new Inner();
		StaticInner sInner = new StaticInner();
		StaticInner sInner2 = new WithInner.StaticInner();
		StaticInner sInner3 = new InheritInner.StaticInner();
//		Inner inner = new WithInner().new Inner();
	}
}
class WithInner{
	public WithInner() {
		// TODO Auto-generated constructor stub
		System.out.println("WithInner constructor");
	}
	class Inner{
		public Inner() {
			// TODO Auto-generated constructor stub
			System.out.println("Inner constructor");
		}
	}
	public static class StaticInner{
		
	}
}