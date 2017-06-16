package unit9;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubTest4.f(new SubTest4());
	}

}

abstract class Test4{
	abstract void g();
}

class SubTest4 extends Test4{
	static void f(Test4 test4){
		
		(test4).g();
	}
	void g(){
		System.out.println("g()");
	}
}