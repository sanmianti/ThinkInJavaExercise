package test;

public class Beetle extends Insect{

	private int k = printInit("Beetle.k initialized");
	
	public Beetle() {
		// TODO Auto-generated constructor stub
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	}
	
	private static int x2 = printInit("static Bettle.x2 initialized");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bettle constructor");
		Beetle beetle = new Beetle();
	}

}

class Insect{
	private int i = 9;
	protected int j;
	public Insect() {
		// TODO Auto-generated constructor stub
		System.out.println("i = " + i + ", j = " + j);
		j = 39;
	}
	private static int x1 =
			printInit("static Insect.x1 initialized");
	static int printInit(String s){
		System.out.println(s);
		return 47;
	}
}

