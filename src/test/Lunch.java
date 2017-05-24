package test;

public class Lunch {

	void testPrivate(){
		
	}
	
	void testStatic(){
		Soup1 soup = Soup1.makeSoup();
	}
	
	void testSingleton(){
		Soup2.access().f();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}

}

class Soup1{
	private Soup1() {
		// TODO Auto-generated constructor stub
	}
	
	public static Soup1 makeSoup(){
		return new Soup1();
	}
}

class Soup2{
	private Soup2(){
		
	}
	
	private static Soup2 ps1 = new Soup2();
	public static Soup2 access(){
		return ps1;
	}
	
	public void f(){
		
	}
}