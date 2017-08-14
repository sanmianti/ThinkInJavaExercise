package unit12;

public class Exercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			f();
		} catch (CusException6 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void f() throws CusException6{
		try {
			g();
		} catch (CusException5 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//Exercise10
//			throw new CusException6();
			//Exercise11
			throw new RuntimeException(new CusException6());
		}
	}
	public static void g() throws CusException5{
		throw new CusException5();
	}
}

class CusException5 extends Exception{}
class CusException6 extends Exception{}