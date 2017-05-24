package test;

public class PlaceSetting extends Custom{

	private Spoon sp;
	private Fork fork;
	private Knife knife;
	private DinnerPlate pl;
	
	public PlaceSetting(int i) {
		// TODO Auto-generated constructor stub
		super(i + 1);
		sp = new Spoon(i + 2);
		fork = new Fork(i + 3);
		knife = new Knife(i + 4);
		pl = new DinnerPlate(i + 5);
		System.out.println("PlaceSetting constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlaceSetting x = new PlaceSetting(9);
	}

}

class Plate{
	public Plate(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Plate constructor");
	}
}

class DinnerPlate extends Plate{
	public DinnerPlate(int i) {
		// TODO Auto-generated constructor stub
		super(i);
		System.out.println("DinnerPlate constructor");
	}
}

class Utensil{
	public Utensil(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Utensil constructor");
	}
}

class Spoon extends Utensil{
	public Spoon(int i) {
		// TODO Auto-generated constructor stub
		super(i);
		System.out.println("Spoon constructor");
	}
}
class Fork extends Utensil{
	public Fork(int i) {
		// TODO Auto-generated constructor stub
		super(i);
		System.out.println("Fork constructor");
	}
}
class Knife extends Utensil{
	public Knife(int i) {
		// TODO Auto-generated constructor stub
		super(i);
		System.out.println("Knife constructor");
	}
}

class Custom{
	public Custom(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Custom constructor");
	}
}

