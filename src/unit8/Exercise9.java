package unit8;

public class Exercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rodent[] rodents = {
				new Mouse(),
				new Gerbil(),
				new Hamster()
		};
		
		for (Rodent rodent : rodents) {
			printName(rodent);
		}
		
		System.out.println(Rodent.counter);
	}

	public static void printName(Rodent r){
		System.out.println(r.getName());
	}
}

interface Rodent{
	
	public static int counter = 0;;
	

	abstract String getName();
}
class Mouse implements Rodent{
	
	public Mouse() {
		// TODO Auto-generated constructor stub
		System.out.println("Mouse constructor");
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Mouse";
	}
}
class Gerbil implements Rodent{
	public Gerbil() {
		// TODO Auto-generated constructor stub
		System.out.println("Gerbil constructor");
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Gerbil";
	}
}
class Hamster implements Rodent{
	public Hamster() {
		// TODO Auto-generated constructor stub
		System.out.println("Hamster constructor");
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Hamster";
	}
}

class ChinaMouse extends Mouse{
	Mouse mouse = new Mouse();
}