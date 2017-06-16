package test;

public class PrivateOverride {

	private void f(){
		System.out.println("private f()");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateOverride privateOverride = new Derived();
		privateOverride.f();
		
	}

}

class Derived extends PrivateOverride{

	public void f(){
		System.out.println("public f()");
	}
	
	public void h(){
		System.out.println("Derived.h()");
	}
}