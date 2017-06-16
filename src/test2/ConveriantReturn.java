package test2;

public class ConveriantReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mill mill = new Mill();
		Grain grain = mill.process();
		System.out.println(grain);
		mill = new WheatMill();
		grain = mill.process();
		System.out.println(grain);
	}

}

class Grain{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Grain";
	}
}
class Wheat extends Grain{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Wheat";
	}
}
class Mill{
	Grain process(){
		return new Grain();
	}
}

class Apple{
	void eat(){
		
	}
	void eat(int i){
		
	}
	void eat(int i, String s){
		
	}
	void eat(String s, int i){
		
	}
	
}
class WheatMill extends Mill{
	
//	Apple process(){
//		return new Apple();
//	}
}