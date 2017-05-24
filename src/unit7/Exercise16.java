package unit7;

public class Exercise16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amphibian amphibian = new Frog();
		amphibian.swim(new Frog());
	}

}

class Amphibian{
	
	 void swim(Amphibian a){
		System.out.println("Amphibian can swim");
	}
}
class Frog extends Amphibian{
	@Override
	void swim(Amphibian a) {
		// TODO Auto-generated method stub
		System.out.println("Frog can swim");
	}
}