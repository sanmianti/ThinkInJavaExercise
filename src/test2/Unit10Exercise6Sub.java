package test2;

import test.Unit10Exercise6;
import unit10.IExercise6;

public class Unit10Exercise6Sub extends Unit10Exercise6 {

	public IExercise6 getInner(){
		return new Inner();
	}
}
