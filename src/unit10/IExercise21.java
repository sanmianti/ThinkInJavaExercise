package unit10;

public interface IExercise21 {
	static class Nested{
		static void f(IExercise21 ie21){
			System.out.println("Nested f()");
			ie21.g();
			
		}
	}
	void g();
}
