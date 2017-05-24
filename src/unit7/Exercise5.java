package unit7;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new C();
	}

}

class A{
	public A(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("A constructor");
	}
}
class B{
	public B(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("B constructor");
	}
}
class C extends A{
	B b = new B(2);
	
	public C() {
		// TODO Auto-generated constructor stub
		super(12);
		System.out.println("C constructor");
	}
}