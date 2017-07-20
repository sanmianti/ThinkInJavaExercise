package unit11;

import java.util.ArrayList;
import java.util.Iterator;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
		for(int i = 0; i < 10; i++){
			gerbils.add(new Gerbil());
		}
		
		for(int i = 0; i < gerbils.size(); i++){
			gerbils.get(i).hop();
		}
		
		for (Gerbil gerbil : gerbils) {
			gerbil.hop();
		}
		
		//Unit 11 Exercise8
		Iterator<Gerbil> iterator = gerbils.iterator();
		while(iterator.hasNext()){
			iterator.next().hop();
		}
	}

}
class Gerbil{
	static int counter;
	final int gerbilNumber = ++ counter;
	public Gerbil() {
		// TODO Auto-generated constructor stub
		
	}
	public void hop(){
		System.out.println(gerbilNumber);
	}
}