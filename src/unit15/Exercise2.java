package unit15;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 <T>{
	
	T a, b, c;
	
	public Exercise2(T a, T b, T c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public T getA() {
		return a;
	}
	public T getB() {
		return b;
	}
	public T getC() {
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise2<String> e2 = new Exercise2<String>("A", "B", "C");
		System.out.println(e2.getA());
		System.out.println(e2.getB());
		System.out.println(e2.getC());
	}

}
