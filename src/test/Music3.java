package test;

public class Music3 {

	public static void tune(Playable i){
		i.play(Note.B_FLAT);
	}
	public static void tuneAll(Instrument[] e){
		for (Instrument instrument : e) {
			tune(instrument);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instrument[] orchestra = {
				new Wind(),
				new Percussion(),
				new Stringed(),
				new Brass(),
				new Woodwind()
		};
		tuneAll(orchestra);
//		System.out.println(new Instrument());
//		for (Instrument instrument : orchestra) {
//			
//		}
	
	}
	
	
}

abstract class Instrument implements Playable{
	abstract String what();
	abstract void adjust();
	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
		
	}
	
}
class Wind extends Instrument{
	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
		System.out.println("Wind.play()" + n);
	}
	@Override
	String what() {
		// TODO Auto-generated method stub
		return "Wind";
	}
	@Override
	void adjust() {
		// TODO Auto-generated method stub
		System.out.println("Adjusting Wind");
	}
}

interface Playable{
	void play(Note n);
}

class Percussion extends Instrument{
	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
		System.out.println("Percussion.play()" + n);
	}
	@Override
	String what() {
		// TODO Auto-generated method stub
		return "Percussion";
	}
	@Override
	void adjust() {
		// TODO Auto-generated method stub
		System.out.println("Adjusting Percussion");
	}
	
}
class Stringed extends Instrument{
	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
		System.out.println("Stringed.play)()" + n );
	}
	@Override
	String what() {
		// TODO Auto-generated method stub
		return "Stringed";
	}
	@Override
	void adjust() {
		// TODO Auto-generated method stub
		System.out.println("Adjusting Stringed");
	}
}

class Brass extends Wind{
	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
		System.out.println("Brass.play()" + n);
	}
	@Override
	void adjust() {
		// TODO Auto-generated method stub
		System.out.println("Adjusting Brass");
	}
}
class Woodwind extends Wind{
	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
		System.out.println("Woodwind.play()" + n);
	}
	@Override
	String what() {
		// TODO Auto-generated method stub
		return "Woodwind";
	}
}

