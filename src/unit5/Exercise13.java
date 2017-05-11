package unit5;

public class Exercise13 {

//	static Cups cups1 = new Cups(); //(2)
//	static Cups cups2 = new Cups(); //(2)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("inside main()");
		Cups.cup1.f(99); //(1)
	}

}

class Cup{
	public Cup(int marker) {
		// TODO Auto-generated constructor stub
		System.out.println("Cup(" + marker + ")");
		
	}
	
	void f(int marker){
		System.out.println("f(" + marker + ")");
	}
}

class Cups{
	static Cup cup1;
	static Cup cup2;
	static{
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}
	
	public Cups() {
		// TODO Auto-generated constructor stub
		System.out.println("Cups()");
	}
}
