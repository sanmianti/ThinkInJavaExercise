package unit7;

public class Exercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Stem(1);
	}

}

class Root{
	Component1 x1 = new Component1(1);
	Component2 x2 = new Component2(1);
	Component3 x3 = new Component3(1);
	
	public Root(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Root constructor" + i);
	}
}
class Component1{
	public Component1(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Component1 constructor"  + i);
	}
}
class Component2{
	public Component2(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Component2 constructor" + i);
	}
}
class Component3{
	public Component3(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Component3 constructor" + i);
	}
}
class Stem extends Root{
	Component1 x1 = new Component1(2);
	Component2 x2 = new Component2(2);
	Component3 x3 = new Component3(2);
	public Stem(int i) {
		// TODO Auto-generated constructor stub
		super(i);
		System.out.println("Stem constructor" + i);
	}
}

