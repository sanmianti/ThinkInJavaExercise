package unit8;

public class Exercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test10 x = new SubSubText10();
		x.f1();
	}

}

class Test10{
	void f1(){
		System.out.println("Test10.f1()");
		f2();
	}
	
	void f2(){
		System.out.println("Test10.f2()");
	}
}
class SubTest10 extends Test10{
	@Override
	void f2() {
		// TODO Auto-generated method stub
		System.out.println("SubTest10.f2()");
	}
}
class SubSubText10 extends SubTest10{
	
}