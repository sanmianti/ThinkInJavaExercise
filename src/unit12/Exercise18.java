package unit12;

public class Exercise18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Exercise18 ex18 = new Exercise18();
			try {
				try {
					ex18.f();
				} finally{
					ex18.dispose();
				}
			} finally{
				ex18.cleanup();
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
class YetAnotherException extends Exception{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Yet another exception";
	}
}
