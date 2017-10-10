package unit12;

public class Exercise25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new C();
		try {
			a.f();
		} catch (Exception3 e) {
			// TODO Auto-generated catch block
			System.out.println("Caught Exception3");
			e.printStackTrace();
		} catch (Exception1 e) {
			// TODO Auto-generated catch block
			System.out.println("Caught Exception1");
			e.printStackTrace();
		}
	}

}
class Exception1 extends Exception{}
class Exception2 extends Exception1{}
class Exception3 extends Exception2{}
class A{
	public void f() throws Exception1{
		throw new Exception1();
	}
}
class B extends A{
	@Override
	public void f() throws Exception2{
		// TODO Auto-generated method stub
		throw new Exception2();
	}
}
class C extends B{
	@Override
	public void f() throws Exception3 {
		// TODO Auto-generated method stub
		throw new Exception3();
	}
}