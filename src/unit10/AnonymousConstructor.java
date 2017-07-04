package unit10;

import test.FinalData;

public class AnonymousConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base = test(new AnonymousClassFinal());
		base.f();
	}

	public static Base getBase(int i){
		return new Base(i){
			int j  = i;
			{
				System.out.println("Inside instance initializer");
			}
			public  void f() {
				// TODO Auto-generated method stub
				System.out.println("In anonymous f()");
				System.out.println(i);
			}
		};
	}
	public static Base test(AnonymousClassFinal acf){
		return new Base(1) {
			
			@Override
			public void f() {
				// TODO Auto-generated method stub
				acf.f();
			}
		};
		
	}
	
}
abstract class Base{
	public Base(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Base constructor, i = " + i);
	}
	public abstract void f();
}
class AnonymousClassFinal{
	public void f(){
		System.out.println("f()");
	}
}