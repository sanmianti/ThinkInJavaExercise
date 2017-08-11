package unit12;

public class ExceptionMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new Exception("My Exception");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Caught Exception");
			System.out.println("getMessage(): " + e.getMessage());
			System.out.println("getLocalizedMessage(): " + e.getLocalizedMessage());
			System.out.println("toString(): " + e);
			e.printStackTrace();
		}
	}

}
