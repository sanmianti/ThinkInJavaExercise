package unit12;

import java.util.Arrays;
import java.util.Collections;

public class Exercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			f(0);
//			throw new NullPointerException();
			
		}catch(Exception e){
			System.out.println(Arrays.toString(e.getStackTrace()));
		}finally {
			System.out.println("finally block");
		}
	}

	public static void f(int i) throws CusException1, CusException2, CusException3{
		switch (i) {
		case 0:
			throw new CusException1("CusException1()");
		case 1:
			throw new CusException2("CusException2()");
		default:
			throw new CusException3("CusException3()");
		}
	}
	private static void g() {
		// TODO Auto-generated method stub
		throw new NullPointerException();
	}
}
class CusException1 extends Exception{
	public CusException1(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}
class CusException2 extends Exception{
	public CusException2(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}
class CusException3 extends Exception{
	public CusException3(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}
