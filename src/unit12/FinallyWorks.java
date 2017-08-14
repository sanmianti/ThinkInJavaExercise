package unit12;

public class FinallyWorks {

	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true){
			try{
				if (count ++ == 0) {
					throw new ThreeException();
				}
			}catch(ThreeException e){
				System.out.println("ThreeException");
			}finally {
				System.out.println("In finally clause");
				if (count == 2) {
					break;
				}
			}
		}
	}

}
class ThreeException extends Exception{
	
}