package unit12;

public class Exercise21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			SubTest21 st21 = new SubTest21();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Caught an exception");
		}
	}

}
class Test21{
	public Test21() throws CustomException{
		// TODO Auto-generated constructor stub
		throw new NullPointerException();
	}
	public void f()throws Exception{
		throw new RuntimeException();
	}
}
class SubTest21 extends Test21{
	public SubTest21() throws CustomException{
		// TODO Auto-generated constructor stub
//		try {
//			super();
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
	}
	@Override
	public void f(){
		// TODO Auto-generated method stub
		try {
			super.f();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
class CustomException extends Exception{
	
}