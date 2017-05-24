package unit7;

import javax.security.auth.x500.X500Principal;

import test.Cleanser;

public class Exercise11 {

	Cleanser cleanser = new Cleanser();
	
	public void dilute(){
		cleanser.dilute();
	}
	public void apply(){
		cleanser.apply();
	}
	public void scrub(){
		cleanser.scrbu();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise11 x = new Exercise11();
		x.dilute();
		x.scrub();
		x.apply();
		System.out.println(x);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return cleanser.toString();
	}

}
