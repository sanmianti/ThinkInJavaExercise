package Test3;

import test2.Apply;

public class FilterProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WaveForm w = new WaveForm();
		Apply.process(new FilterAdapter(new LowPass(1.0)), w);
		Apply.process(new FilterAdapter(new HighPass(2.0)), w);
		Apply.process(new FilterAdapter(new BandPass(4.0, 4.0)), w);
	}

}
