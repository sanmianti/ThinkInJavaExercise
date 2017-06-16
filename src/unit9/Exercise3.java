package unit9;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PrintClass().print();
	}

}

abstract class Test3{
	abstract public void print();
	public Test3() {
		// TODO Auto-generated constructor stub
		print();
	}
}

class PrintClass extends Test3{
	
	int i = 1;
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("i: " + i);
	}
}