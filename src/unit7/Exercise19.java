package unit7;

public class Exercise19 {

	
	private final Test19 t;
	
	public Exercise19() {
		// TODO Auto-generated constructor stub
		t = new Test19();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exercise19 xx = new Exercise19();
		
		//error:The final field Exercise19.t cannot be assigned
//		xx.t = new Test19();
		
	}

}

class Test19{
	
}