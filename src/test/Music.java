package test;

public class Music {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wind_ x = new Wind_();
		tune(x);
	}

	public static void tune(Instrument_ i){
		i.play(Note.B_FLAT);
	}
}

enum Note{
	MIDDLE_C, C_SHARP, B_FLAT;
}

class Instrument_{
	public void play(Note n){
		System.out.println("Instrument.play()");
	}
}

class Wind_ extends Instrument_{
	
	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
		System.out.println("Wind_.play()" + n);
	}
	
}