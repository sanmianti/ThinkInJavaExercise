package unit10;

public class MultiInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X x = new X();
		Y y = new Y();
		takesA(x);
		takesA(y);
		takesB(x);
		takesB(y.makeB());
	}

	static void takesA(A a){}
	static void takesB(B b){}
}
interface A{}
interface B{}
class X implements A, B{
	
}
class Y implements A{
	B makeB(){
		return new B() {
		};
	}
}