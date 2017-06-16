package test;

public class BlackFinal {

	private final int i = 0;
	private final int j;
	private final Poppet p;
	
	public BlackFinal() {
		// TODO Auto-generated constructor stub
		j = 1;
		p = new Poppet(1);
	}
	
	public BlackFinal(int i){
		j = i;
		p = new Poppet(1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BlackFinal();
		new BlackFinal(1);
	}

}

class Poppet{
	private int i;
	Poppet(int i) {
		// TODO Auto-generated constructor stub
		this.i = i;
	}
}