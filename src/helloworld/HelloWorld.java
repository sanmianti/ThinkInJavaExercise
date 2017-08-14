package helloworld;

public class HelloWorld {
	
	public static void main(String[] args){
		try {
			f(null);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		System.out.println("dddd");
	}
	
	public static void f(String s){
		System.out.println(s.length());
	}
	
}

