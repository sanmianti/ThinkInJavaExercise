package unit10;

public class Exercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test10().g(true).f();
	}

}
interface ITest10{
	void f();
}
class Test10{
	ITest10 g(boolean result){
//		if (result) {
//			class Inner implements ITest10{
//				@Override
//				public void f() {
//					// TODO Auto-generated method stub
//					System.out.println("f()");
//				}
//			}
//			return new Inner();
//		}
//		return null;
		{
			class Inner implements ITest10{
			@Override
			public void f() {
				// TODO Auto-generated method stub
				System.out.println("f()");
				}
			}
			return new Inner();
		}
		
		
		
	}
}