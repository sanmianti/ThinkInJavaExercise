package unit12;

import javax.management.RuntimeErrorException;

public class Exercise15 {
	
	static Switch sw = new Switch();
	static void f() throws OnOffException1, OnOffException2{
		throw new RuntimeException("Inside try");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
				sw.on();
				f();
			} catch (OnOffException1 e) {
				// TODO: handle exception
				System.out.println("OnOffException1");
			}catch (OnOffException2 e) {
				// TODO: handle exception
				System.out.println("OnOffException2");
			}finally {
				sw.off();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception '" + e + "'. Did the switch get turned off?");
			System.out.println(sw);
		}
	}

}
