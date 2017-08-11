package unit12;

public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test8 test8 = new Test8();
		try {
			test8.f();
		} catch (CusException4 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}

}

class Test8 {
	public void f() throws CusException4{
		System.out.println("f()");
		throw new CusException4("CusException4");
	}
}