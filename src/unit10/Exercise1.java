package unit10;

import unit10.Outer.Inner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Inner inner = new Outer().getInner();
	
	}

}
class Outer{
	class Inner {
		
	}
	Inner getInner(){
		return new Inner();
	}
}