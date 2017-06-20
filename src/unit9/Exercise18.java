package unit9;

public class Exercise18 {

	public static void goSchoolByCycle(Factory factory){
		Cycle cycle = factory.getCycle();
		cycle.goSchool();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		goSchoolByCycle(new UnicycleFactory());
		goSchoolByCycle(new BicycleFactory());
		goSchoolByCycle(new TircycleFactory());
	}

}
interface Cycle{
	void goSchool();
}
class Unicycle implements Cycle{
	@Override
	public void goSchool() {
		// TODO Auto-generated method stub
	
		System.out.println("Go school by Unicycle");
	}
}
class Bicycle implements Cycle{
	@Override
	public void goSchool() {
		// TODO Auto-generated method stub
	
		System.out.println("Go school by Bicycle");
	}
}
class Tricycle implements Cycle{
	@Override
	public void goSchool() {
		// TODO Auto-generated method stub
	
		System.out.println("Go school by Thircycle");
	}
}
interface Factory{
	Cycle getCycle();
}
class UnicycleFactory implements Factory{
	@Override
	public Cycle getCycle() {
		// TODO Auto-generated method stub
		return new Unicycle();
	}
}
class BicycleFactory implements Factory{
	@Override
	public Cycle getCycle() {
		// TODO Auto-generated method stub
		return new Bicycle();
	}
}
class TircycleFactory implements Factory{
	@Override
	public Cycle getCycle() {
		// TODO Auto-generated method stub
		return new Tricycle();
	}
}