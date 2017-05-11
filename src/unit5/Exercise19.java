package unit5;

public class Exercise19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test19.f("a", "b", "c");
		Test19.f(new String[]{"hello", "world", "hello world"});
	}

}

class Test19{
	
	static void f(String...strings){
		for (String string : strings) {
			System.out.println(string);
		}
	}
}
