package unit5;

public class Exercise14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class14.print();
	}

}

class Class14{
	
	static String s1 = "hello";
	static String s2;
	
	static{
		s2 = "world";
	}
	
	static void print(){
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
	}
}