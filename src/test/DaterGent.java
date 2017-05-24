package test;

import java.sql.Date;

public class DaterGent extends Cleanser{

	@Override
	public void scrbu() {
		// TODO Auto-generated method stub
		append("Detergent.scrbu()");
		super.scrbu();
	}
	public void foam(){
		append("foam()");
	}
	
	public static void main(String[] args){
		DaterGent x = new DaterGent();
		x.dilute();
		x.apply();
		x.scrbu();
		x.foam();
		System.out.println(x);
		System.out.println("Testing base class:");
		Cleanser.main(args);
		System.out.println("多态");
		Cleanser y = new DaterGent();
		y.scrbu();
		System.out.println(y);
		System.out.println("args 长度为:  " + args.length);
	}
}
