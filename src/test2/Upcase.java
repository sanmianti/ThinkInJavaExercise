package test2;

public class Upcase implements MProcessor {
	@Override
	public
	 String process(Object input) {
		// TODO Auto-generated method stub
		return ((String)input).toUpperCase();
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName();
	}
}
