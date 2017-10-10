package unit13;

import java.text.Normalizer.Form;
import java.util.Formatter;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formatter f = new Formatter(System.out);
		char u = 'a';
		System.out.println("u = 'a'");
		f.format("s: %s\n", u);
//		f.format("d: %d\n", u);
		f.format("c: %c\n", u);
		f.format("b: %b\n", u);
		f.format("h: %h\n", u);
		f.format("b: %b\n", 0);
	}

}
