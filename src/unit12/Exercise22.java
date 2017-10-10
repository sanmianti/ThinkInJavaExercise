package unit12;

public class Exercise22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(boolean b = false; ; b = !b){
			try {
				FailingConstructor fc = new FailingConstructor(b);
				try {
					System.out.println("Progressing...");
				} finally {
					// TODO: handle finally clause
					System.out.println("Cleanning...");
				}
			} catch (CustomException e) {
				// TODO: handle exception
				System.out.println(e.getClass().getSimpleName());
				break;
			}
		}
	}

}
class FailingConstructor{
	public FailingConstructor(boolean isFail) throws CustomException{
		// TODO Auto-generated constructor stub
		if (isFail) {
			throw new CustomException();
		}
	}
}
