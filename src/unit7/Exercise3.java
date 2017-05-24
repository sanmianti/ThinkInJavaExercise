package unit7;

public class Exercise3 extends Test3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exercise3(3);
	}

	public Exercise3() {
		// TODO Auto-generated constructor stub
		System.out.println("Exercise3 constructor");
	}
	public Exercise3(int i) {
		// TODO Auto-generated constructor stub
		super(3);
		System.out.println("Exercise3 constructor: Exercise3(int)");
	}
	
}

class Test3{
	
	public Test3() {
		// TODO Auto-generated constructor stub
		System.out.println("Test3 constructor");
	}
	
	public Test3(int i){
		System.out.println("Test3 constructor: Test3(int)");
	}
}
