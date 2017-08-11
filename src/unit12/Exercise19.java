package unit12;

public class Exercise19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Exercise19 ex19 = new Exercise19();
			try {
				ex19.f();
			} finally{
				try {
					ex19.dispose();
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	void f() throws VeryImportantException{
		throw new VeryImportantException();
	}
	void dispose() throws HoHumException{
		throw new HoHumException();
	}
	void cleanup() throws YetAnotherException{
		throw new YetAnotherException();
	}

}

