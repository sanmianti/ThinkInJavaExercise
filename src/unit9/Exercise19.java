package unit9;

import java.util.Random;

public class Exercise19 {
	
	public static void playGame(GamblingFactory factory){
		Gambling game = factory.getGambling();
		game.play();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		playGame(new ThrowCoinGameFactory());
		playGame(new DiceGameFactory());
	}

}
interface Gambling {
	void play();
}
class ThrowCoinsGame implements Gambling{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		int i= new Random().nextInt(2);
		switch (i) {
		case 0:
			System.out.println("正面");
			break;
		case 1:
			System.out.println("背面");
			break;
		default:
			System.out.println("good luck， 硬币竟然立起来了！");
			break;
		}
	}
}
class DiceGame implements Gambling{
	@Override
	public void play() {
		// TODO Auto-generated method stub
		int i = new Random().nextInt(6);
		System.out.println((i + 1) + "点");
	}
}
interface GamblingFactory{
	Gambling getGambling();
}
class ThrowCoinGameFactory implements GamblingFactory{
	@Override
	public Gambling getGambling() {
		// TODO Auto-generated method stub
		return new ThrowCoinsGame();
	}
}
class DiceGameFactory implements GamblingFactory{
	@Override
	public Gambling getGambling() {
		// TODO Auto-generated method stub
		return new DiceGame();
	}
}