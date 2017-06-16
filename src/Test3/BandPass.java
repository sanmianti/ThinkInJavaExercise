package Test3;

public class BandPass extends Filter{

	double lowCutoff, highCutoff;
	public BandPass(double lowCut, double highCut) {
		// TODO Auto-generated constructor stub
		lowCutoff  = lowCut;
		highCutoff = highCut;
	}
	
	@Override
	public WaveForm process(WaveForm input) {
		// TODO Auto-generated method stub
		return input;
	}
}
