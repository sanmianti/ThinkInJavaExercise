package test;

public class Sandwich extends PortableLunch implements FastFood{

	public void f() {
		// TODO Auto-generated method stub
		
	}
	private Bread bread = new Bread();
	private Cheese cheese = new Cheese();
	private Lettuce lettuce = new Lettuce();
	private Pickle pickle = new Pickle();
	public Sandwich() {
		// TODO Auto-generated constructor stub
		System.out.println("Sandwich()");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sandwich sandwich = new Sandwich();
//		System.out.println(sandwich.lunch1.toString());
	}

}

class Meal{
	Bread bread = new Bread();
	Meal() {
		// TODO Auto-generated constructor stub
		System.out.println("Meal()");
	}
}
class Bread{
	Bread() {
		// TODO Auto-generated constructor stub
		System.out.println("Bread()");
	}
}
class Cheese{
	Cheese() {
		// TODO Auto-generated constructor stub
		System.out.println("Cheese()");
	}
}
class Lettuce{
	Lettuce() {
		// TODO Auto-generated constructor stub
		System.out.println("Lettuce()"); 
	 }
}
class Lunch1 extends Meal{
	Lunch1() {
		// TODO Auto-generated constructor stub
		System.out.println("Lunch1()");
	}
}
class PortableLunch extends Lunch1{
	Lunch1 lunch1;//not init
	PortableLunch() {
		// TODO Auto-generated constructor stub
		System.out.println("PortableLunch()");
	}
}
class Pickle{
	Pickle() {
		// TODO Auto-generated constructor stub
		System.out.println("Pickle()");
	}
}

interface FastFood {
	void f();
}