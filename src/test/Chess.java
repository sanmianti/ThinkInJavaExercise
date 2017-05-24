package test;

public class Chess extends BoardGame{

	public Chess() {
		// TODO Auto-generated constructor stub
		super(11);
		System.out.println("Chess constructor");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chess();
	}

}

class Game{
	public Game(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Game constructor");
	}
}
class BoardGame extends Game{
	public BoardGame(int i) {
		// TODO Auto-generated constructor stub
		super(i);
		System.out.println("BoardGame constructor");
	}
}