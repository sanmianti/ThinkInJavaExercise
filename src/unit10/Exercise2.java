package unit10;

import java.io.BufferedWriter;

import unit10.Test2.InnerTest2;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Object[] sequence = new Object[10];
//		for(int i = 0; i < sequence.length; i++){
//			sequence[i] = new Test2(Integer.toString(i));
//		}
//		for (Object object : sequence) {
//			System.out.println(object.toString());
//		}
		Test2 test2 = new Test2("hello world");
		InnerTest2 it = test2.getInnerClass();
		System.out.println(it);
		//No enclosing instance of type Test2 is
		//accessible. Must qualify the allocation with an enclosing 
		//instance of type Test2 (e.g. x.new A() where x is an instance
		//of Test2).
//		InnerTest2 iTest2 = new InnerTest2();
	}

}

class Test2{
	private String s ;
	
	public Test2(String s) {
		// TODO Auto-generated constructor stub
		this.s = s;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return s;
	}
	
	InnerTest2 getInnerClass(){
		return new InnerTest2();
	}
	class InnerTest2{
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return s;
		}
	}
}