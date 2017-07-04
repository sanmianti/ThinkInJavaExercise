package unit10;

import unit10.IExercise21.Nested;

public class Exercise21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nested.f(new IExercise21(){
			@Override
			public void g() {
				// TODO Auto-generated method stub
				System.out.println("g()");
			}
		});
	}

}
