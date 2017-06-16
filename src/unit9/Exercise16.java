package unit9;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class Exercise16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(new CharSequenceAdapter(10));
		while(scanner.hasNext()){
			System.out.println(scanner.next());
		}
		scanner.close();
	}

}

class CharSequence{
	private String chapters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private String lowers = "abcdefghijklmnopqrstuvwxyz";
	private String vowels = "aeiou";
	private Random random = new Random(47);
	
	public char[] generateCharSq(){
		char[] charSq = new char[10];
		int index = 0;
		charSq[index++] = chapters.charAt(random.nextInt(chapters.length()));
		for(int i = 0; i < 4; i++){
			charSq[index++] = lowers.charAt(random.nextInt(lowers.length()));
			charSq[index++] = vowels.charAt(random.nextInt(vowels.length()));
		}
		
		charSq[index] = ' ';
		
//		for(int i = 0; i <= 4; i++){
//			charSq[2*i + 1] = lowers.toCharArray()[random.nextInt(26)];
//			if (i == 0) {
//				charSq[i] = chapters.toCharArray()[random.nextInt(26)];
//			}else {
//				charSq[2*i] = vowels.toCharArray()[random.nextInt(5)]; 
//			}
//			charSq[9] = ' ';
//		}
//		
		return charSq;
	}
}
class CharSequenceAdapter extends CharSequence implements Readable{
	
	private int count;
	public CharSequenceAdapter(int count) {
		// TODO Auto-generated constructor stub
		this.count = count;
	}
	@Override
	public int read(CharBuffer cb) throws IOException {
		// TODO Auto-generated method stub
		if (count-- == 0) {
			return -1;
		}
		cb.put(generateCharSq());
		return 1;
	}
}