package unit10;

import unit10.IExercise20.Nested;

public class Exercise20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Nested nested = new Nested();
//		nested.g();
		Nested nested = new IExercise20() {
			
			@Override
			public Nested get() {
				// TODO Auto-generated method stub
				return new Nested();
			}
		}.get();
		nested.g();
	}

}
