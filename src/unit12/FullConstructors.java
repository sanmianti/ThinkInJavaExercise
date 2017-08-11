package unit12;

public class FullConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			f();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			g();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void f() throws MyException{
		System.out.println("Throwing MyException from f()");
		throw new MyException();
	}
	public static void g() throws MyException{
		System.out.println("Throwing MyException from g()");
		throw new MyException("Originated in g()");
	}
}
class MyException extends Exception{
	public MyException() {
		// TODO Auto-generated constructor stub
	}
	public MyException(String msg){
		super(msg);
	}
}
