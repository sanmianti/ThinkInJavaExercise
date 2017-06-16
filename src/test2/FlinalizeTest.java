package test2;

public class FlinalizeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finalize finalize = new Finalize();
		
		System.gc();
		System.runFinalization();
	}

}
class Finalize{
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Finalize.finalize()");
		super.finalize();
	}
}