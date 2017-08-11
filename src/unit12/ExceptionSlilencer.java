package unit12;

public class ExceptionSlilencer {

	@SuppressWarnings("finally")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new RuntimeException();
		}finally{
			return;
		}
	}

}
