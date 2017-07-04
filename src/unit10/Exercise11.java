package unit10;

public class Exercise11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test11 test11 = new Test11();
		IExercise11 ie = test11.getInner();
		ie.f();
		
	}

	
}
class Test11{
	private class Inner implements IExercise11{

		@Override
		public void f() {
			// TODO Auto-generated method stub
			System.out.println("Inner.f()");
		}
		
	}
	
	IExercise11 getInner(){
		return new Inner();
	}
	Inner getInner2(){
		return new Inner();
	}
}

