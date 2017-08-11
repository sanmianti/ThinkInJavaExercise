package unit12;

public class Rethrowing {

	public static void f() throws Exception{
		System.out.println("originating the exception in f()");
		throw new Exception("thrown from f()");
	}
	public static void g() throws Exception{
		try{
			f();
		}catch(Exception e){
			System.out.println("Inside g(), e.printStackTrace()");
			e.printStackTrace();
			throw e;
		}
	}
	public static void h() throws Exception{
		try {
			f();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Inside h(), e.printStackTrace()");
			e.printStackTrace();
			throw (Exception)e.fillInStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			g();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("main: printStackTrace()");
			e.printStackTrace();
		}
		try {
			h();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("main: printStackTrace()");
			e.printStackTrace();
		}
	}

}
