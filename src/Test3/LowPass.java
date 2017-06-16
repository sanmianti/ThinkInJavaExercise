package Test3;

public class LowPass extends Filter{
	double cutoff;
	public LowPass(double cutoff) {
		// TODO Auto-generated constructor stub
		this.cutoff = cutoff;
	}
	@Override
	public WaveForm process(WaveForm input) {
		// TODO Auto-generated method stub
		return input;
	}
}
