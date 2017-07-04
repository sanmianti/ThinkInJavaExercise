package unit10;

public class Exercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test9().g().f();;
	}

}
interface ITest9{
	void f();
}
class Test9{
	ITest9 g(){
		class Inner implements ITest9{
			@Override
			public void f() {
				// TODO Auto-generated method stub
				System.out.println("f()");
			}
			
		}
		return new Inner();
	}
}