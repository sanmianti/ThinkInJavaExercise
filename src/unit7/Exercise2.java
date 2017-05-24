package unit7;

import test.DaterGent;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test2 test2  = new Test2();
		test2.scrbu();
		System.out.println(test2);
		test2.sterilize();
	}

}

class Test2 extends DaterGent{
	@Override
	public void scrbu() {
		// TODO Auto-generated method stub
		append("Test2.scrbu()");
		super.scrbu();
	}
	
	void sterilize(){
		System.out.println("sterilize()");
	}
}
