package unit15;

public class TupleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoTuple<String, Integer> ttsi = f();
		System.out.println(ttsi);
		System.out.println(g());
		System.out.println(h());
		System.out.println(k());

	}

	static TwoTuple<String, Integer> f(){
		return new TwoTuple<String, Integer>("hi", 45);
	}
	static ThreeTuple<Amphibian, String, Integer>g(){
		return new ThreeTuple<Amphibian, String, Integer>(new Amphibian(), "hi", 47);
	}
	static FourTuple<Vehicle, Amphibian, String, Integer>h(){
		return new FourTuple<Vehicle, Amphibian, String, Integer>(new Vehicle(), new Amphibian(), "hi", 45);
	}
	static FiveTuple<Vehicle, Amphibian, String, Integer, Double> k(){
		return new FiveTuple<Vehicle, Amphibian, String, Integer, Double>(new Vehicle(), new Amphibian(), "hi", 45, 11.11);
	}
}
class Amphibian{}
class Vehicle{}