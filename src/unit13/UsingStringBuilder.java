package unit13;

import java.util.Random;

public class UsingStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UsingStringBuilder usb = new UsingStringBuilder();
		System.out.println(usb);
	}
	public static Random random = new Random(47);
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder result = new StringBuilder("[");
		for(int i = 0; i < 25; i++){
			result.append(random.nextInt(100));
			result.append(", ");
		}
		result.delete(result.length() - 2, result.length());
		result.append("]");
		return result.toString();
	}

}
