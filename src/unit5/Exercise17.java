package unit5;

import java.util.Random;

public class Exercise17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test17[] a = new Test17[10];
		
		for (Test17 test17 : a) {
			test17 = new Test17(new Random().nextInt(50) + "");
		}
	}

}

class Test17{
	public Test17(String s) {
		// TODO Auto-generated constructor stub
		System.out.println("Test17(" + s + ")");
	}
}