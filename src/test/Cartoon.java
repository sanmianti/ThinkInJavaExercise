package test;

public class Cartoon extends Drawing{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cartoon x = new Cartoon();
	}

	public Cartoon() {
		// TODO Auto-generated constructor stub
		System.out.println("Cartoon constructor");
	}
}

class Art{
	public Art() {
		// TODO Auto-generated constructor stub
		System.out.println("Art constructor");
	}
}

class Drawing extends Art{
	public Drawing() {
		// TODO Auto-generated constructor stub
		System.out.println("Drawing constructor");
	}
}