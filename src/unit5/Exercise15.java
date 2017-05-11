package unit5;

public class Exercise15 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class15 class15 = new Class15();
		System.out.println(class15.s);
	}

}

class Class15{
	String s;
	{
		s = "hello";
		System.out.println("string s initialized");
	}
}
