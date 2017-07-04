package unit10;

public class Exercise26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

class Test26{
	class Inner{
		public Inner(int i) {
			// TODO Auto-generated constructor stub
		}
	}
}
class TTest26{
	class IInner extends Test26.Inner{

		public IInner(Test26 test26, int i) {
			test26.super(i);
			// TODO Auto-generated constructor stub
		}
		
	}
}