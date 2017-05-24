package test;

public class Cleanser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cleanser x = new Cleanser();
		x.dilute();
		x.apply();
		x.scrbu();
		System.out.println(x);
	}

	private String string = "Cleanser";
	public void append(String a){
		string += a;
	}
	public void dilute(){
		append("dilute()");
	}
	public void apply(){
		append("apply()");
	}
	public void scrbu(){
		append("scrub()");
	}
	public String toString(){
		return string;
	}
}
