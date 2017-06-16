package Test3;

public class HighPass extends Filter{
	double cutoff;
	public HighPass(double cutoff) {
		// TODO Auto-generated constructor stub
		this.cutoff = cutoff;
	}
	@Override
	public WaveForm process(WaveForm input) {
		// TODO Auto-generated method stub
		return input;
	}
}
