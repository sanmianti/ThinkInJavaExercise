package unit8;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ride(new Cycle());
//		ride(new Unicycle());
//		ride(new Bicycle());
//		ride(new Tricycle());
		Cycle[] c = {new Unicycle(), new Bicycle(), new Tricycle()};
		((Unicycle)c[0]).balance();
		((Bicycle)c[1]).balance();
//		((Tricycle)c[2]).balcnce();
	}

	public static void ride(Cycle cycle){
		System.out.println("ride " + cycle.getName());
	}
}

class Cycle{
	String getName(){
		return "Cycle";
	}
	
	public static void f(){
		
	}
}

class Unicycle extends Cycle{

	@Override
	String getName() {
		// TODO Auto-generated method stub
		return "Unicycle";
	}

	public void balance() {
		System.out.println("Unicle.balance()");
	}
}

class Bicycle extends Cycle{
	@Override
	String getName() {
		// TODO Auto-generated method stub
		return "Bicycle";
	}
	
	public void balance() {
		System.out.println("Bicycle.balance()");
	}
}
class Tricycle extends Cycle{
	@Override
	String getName() {
		// TODO Auto-generated method stub
		return "Tricycle";
	}
}
