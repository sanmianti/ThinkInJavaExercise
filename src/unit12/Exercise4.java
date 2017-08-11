package unit12;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new CusException4("hei");
		} catch (CusException4 e) {
			// TODO: handle exception
			System.out.println(e.exceptionMsg);
		}
	}

}
class CusException4 extends Exception{
	
	public String exceptionMsg;
	
	public CusException4(String msg) {
		// TODO Auto-generated constructor stub
		exceptionMsg = msg;
	}
}
