package test;

public class OverloadingVarargs {

	static void f(Character... args){
		System.out.println("first");
		for (Character character : args) {
			System.out.println(character);
		}
		
		System.out.println();
	}
	
	static void f(Integer... args){
		System.out.println("second");
		for (Integer integer : args) {
			System.out.println(integer + "");
			
		}
		
		System.out.println();
	}
	
	static void f(Long... args){
		System.out.println("third");
	}
	
	static void f(Integer i){
		System.out.println("forth");
		System.out.println(i + "");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f('a', 'b', 'c');
		f(1);
		f(2, 1);
		f(0);
		f(0l);
		
	}

}
