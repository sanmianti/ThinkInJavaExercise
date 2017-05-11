package test;

public class OverloadingVarargs2 {

	static void f(float i, Character...characters ){
		System.out.println("first");
	}
	
	static void f(Character...characters){
		System.out.println("second");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
