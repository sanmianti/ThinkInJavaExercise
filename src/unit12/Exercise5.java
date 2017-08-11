package unit12;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
//		while(true){
//			if (i < 1000) {
//				try {
//					throw new Exception();
//				} catch (Exception e) {
//					// TODO: handle exception
//					e.printStackTrace();
//					++i;
//				}
//			}else {
//				break;
//			}
//		}
		
		while(i < 1000){
			try {
				throw new UnsupportedOperationException();
			} catch (Exception e) {

				// TODO: handle exception
				++i;
				System.out.println(i + "");
			}
		}
		System.out.println("end");
	}

}
