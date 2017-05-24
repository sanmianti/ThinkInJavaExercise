package test;

public class Hide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bart bart = new Bart();
		bart.doh(1);
		bart.doh('x');
		bart.doh(new Milhouse());
		
	}

}

class Homer{
	char doh(char c){
		System.out.println("doh(char)");
		return 'd';
	}
	float doh(float f){
		System.out.println("doh(float)");
		return 1.0f;
	}
}

class Milhouse{
	
}

class Bart extends Homer{
	void doh(Milhouse m){
		System.out.println("doh(Mihouse)");
	}
	
	@Override
	float doh(float f) {
		// TODO Auto-generated method stub
		System.out.println("Bart#doh(float)");
		return 2.22f;
	}
}

