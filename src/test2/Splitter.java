package test2;

import java.util.Arrays;

public class Splitter implements MProcessor{
	@Override
	public String process(Object input) {
		// TODO Auto-generated method stub
		return Arrays.toString(((String)input).split(" "));
	}
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName();
	}
}
