package unit11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Rodent> mouseList = new ArrayList<Rodent>();
		mouseList.add(new Mouse());
		mouseList.add(new GerbilA());
		mouseList.add(new Hamster());
		mouseList.add(new ChinaMouse());
		Iterator<Rodent> iterator = mouseList.iterator();
		while(iterator.hasNext()){
			Rodent rodent = iterator.next();
			System.out.println(rodent.getName());
		}
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
class GerbilA implements Rodent{
	public GerbilA() {
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