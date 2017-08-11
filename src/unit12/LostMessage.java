package unit12;

public class LostMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			LostMessage lostMessage = new LostMessage();
			try {
				lostMessage.f();
			}catch(Exception e){
				System.out.println(e);
				lostMessage.dispose();
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

}
class VeryImportantException extends Exception{
	@Override
	public String toString() {
		return "A very important exception";
	}
}
class HoHumException extends Exception{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "A trivial exception";
	}
}