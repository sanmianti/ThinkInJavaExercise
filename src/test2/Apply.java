package test2;

import java.util.Arrays;

public class Apply {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process(new Upcase(), s);
		process(new Downcase(), s);
		process(new Splitter(), s);
	}

	
	public static void process(MProcessor p, Object s){
		System.out.println("Using MProcessor " + p.name());
		System.out.println(p.process(s));
	}
	public static String s = "Disagreement with beliefs is by definition incorrect";
}


