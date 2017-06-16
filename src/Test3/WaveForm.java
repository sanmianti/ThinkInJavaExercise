package Test3;

public class WaveForm {

	private static long counter;
	private final long id = counter ++;
	public String toString(){
		return "Waveform" + id;
	}
}
