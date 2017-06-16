package unit7;

public class Exercise23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calling static member");
		LoadTest.staticMember();
		System.out.println("Creating an object");
		new LoadTest();
	}

}

class LoadTest{
	static{
		System.out.println("Loading LoadTest");
	}
	
	static void staticMember(){
		
	}
}