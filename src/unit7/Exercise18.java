package unit7;

import java.util.Random;

public class Exercise18 {

	static Random rand = new Random(100);
	public static final int INT_1 = rand.nextInt(50);
	public final int i2 = rand.nextInt(50);
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "INT_1: " + INT_1 + "," + "i2:" + i2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Exercise18());
		System.out.println(new Exercise18());
		System.out.println(new Exercise18());
		System.out.println(new Exercise18());
		System.out.println(new Exercise18());
		System.out.println(new Exercise18());
	}

}
