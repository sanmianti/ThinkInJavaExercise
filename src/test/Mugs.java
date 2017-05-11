package test;

public class Mugs {

	Mug mug1;
	Mug mug2;
	{
		mug1 = new Mug(1);
		mug2 = new Mug(2);
		System.out.println("mug1 & mug2 initialized");
	}
	
//	public Mugs() {
//		// TODO Auto-generated constructor stub
//		System.out.println("Mugs()");
//	}
//	
//	public Mugs(int marker){
//		System.out.println("Mugs(int)");
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Inside main()");
//		new Mugs();
//		System.out.println("new Mugs() completed");
//		new Mugs(1);
//		System.out.println("new Mugs(1) completed");
		new Mugs();
		new Mugs();
	}

}

class Mug{
	public Mug(int marker) {
		// TODO Auto-generated constructor stub
		System.out.println("Mug(" + marker + ")");
		
	}
	
	void f(int marker){
		System.out.println("f(" + marker + ")");
	}
}