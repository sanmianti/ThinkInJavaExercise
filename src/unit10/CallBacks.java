package unit10;

public class CallBacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Callee1 c1 = new Callee1();
		Callee2 c2 = new Callee2();
		MyIncrement.f(c2);
		Caller caller1 = new Caller(c1);
		Caller caller2 = new Caller(c2.getCallbackReference());
		caller1.go();
		caller1.go();
		caller2.go();
		caller2.go();
	}

}
interface Incrementable{
	void increment();
}
class Callee1 implements Incrementable{
	private int i = 0;
	@Override
	public void increment() {
		// TODO Auto-generated method stub
		i++;
		System.err.println(i);
	}
}
class MyIncrement{
	public void increment(){
		System.out.println("Other operation");
	}
	static void f(MyIncrement mi){
		mi.increment();
	}
}

class Callee2 extends MyIncrement{
	private int i = 0;
	@Override
	public void increment() {
		// TODO Auto-generated method stub
		super.increment();
		i++;
		System.out.println(i);
	}
	
	private class Closure implements Incrementable{
		@Override
		public void increment() {
			// TODO Auto-generated method stub
			Callee2.this.increment();
		}
	}
	Incrementable getCallbackReference(){
		return new Closure();
	}
}
class Caller{
	private Incrementable callbackReference;
	public Caller(Incrementable cbh) {
		// TODO Auto-generated constructor stub
		callbackReference = cbh;
	}
	void go(){
		callbackReference.increment();
	}
}