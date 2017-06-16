package test2;

public class Downcase implements MProcessor{

	@Override
	public
	String process(Object input) {
		// TODO Auto-generated method stub
		return ((String)input).toLowerCase();
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName();
	}
}
