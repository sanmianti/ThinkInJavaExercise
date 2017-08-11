package unit12;

public class RethrowNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			try {
				f();
			} catch (OneException e) {
				// TODO: handle exception
				System.out.println("Caught in inner try, e.printStackTrace()");
				e.printStackTrace();
				throw new TwoException("form inner try");
			}
		}catch(TwoException e){
			System.out.println("Caught in outer try, e.printStackTrace()");
			e.printStackTrace();
		}
		
	}
	
	public static void f() throws OneException{
		System.out.println("originating the exception in f()");
		throw new OneException("thown form f()");
	}
}
class OneException extends Exception{
	public OneException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}
class TwoException extends Exception{
	public TwoException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}