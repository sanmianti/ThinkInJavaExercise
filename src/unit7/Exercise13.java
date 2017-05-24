package unit7;

public class Exercise13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubTest13 x = new SubTest13();
		x.test();
		x.test('x');
		x.test(1);
		x.test("xx");
	}

}

class Test13{
	void test(){
		System.out.println("test()");
	}
	void test(int i){
		System.out.println("test(int)");
	}
	void test(char c){
		System.out.println("test(char)");
	}
}

class SubTest13 extends Test13{
	
	void test(String s){
		System.out.println("test(String)");
	}
}