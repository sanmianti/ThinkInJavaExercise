package unit12;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new UnsupportedOperationException("Unsupport");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}finally {
			System.out.println("finally()");
		}
	}

}
