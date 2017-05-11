package test;

public class OptionalTrailingArguments {

	static void f(int requered, String... trailing){
		System.out.println("required: " + requered);
		for (String string : trailing) {
			System.out.println(string );
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		f(1, "one");
		f(2, "two", "three");
		f(0);
	}

}
