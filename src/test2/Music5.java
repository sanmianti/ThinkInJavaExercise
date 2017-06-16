package test2;

import org.omg.CosNaming.NamingContextPackage.NotEmpty;

public class Music5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

enum Note{
	MIDDLE_C, C_SHARP, B_FLAT;
}
interface Instrument{
	int VALUE = 5; //static & final
	void play(Note note) ;
	void adjust();
}
