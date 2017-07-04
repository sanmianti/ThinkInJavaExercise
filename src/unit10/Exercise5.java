package unit10;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer5 o = new Outer5();
		Outer5.Inner i = o.new Inner();
		
	}
	
	
}
class Outer5{
	class Inner{}
}