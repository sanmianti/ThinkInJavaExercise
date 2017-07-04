package unit10;

public class MultiImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Z z = new Z();
		takesD(z);
		takesE(z.makeE());
	}
	static void takesD(D d){}
	static void takesE(E e){}

}
class D{}
abstract class E{}
class Z extends D{
	E makeE(){
		return new E() {
		};
	}
}
