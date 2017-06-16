package test2;

import java.util.Arrays;

public abstract class StringProcessor implements MProcessor{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName();
	}
	
	public abstract String process(Object input);
	public static String string = "If she weighs the same as a duck, she's made of wood";
	
	public static void main(String[] args){
		Apply.process(new Upcase(), string);
		Apply.process(new Downcase(), string);
		Apply.process(new Splitter(), string);
	}
}

class Upcase_ extends StringProcessor{
	
	@Override
	public String process(Object input) {
		// TODO Auto-generated method stub
		return ((String)input).toUpperCase();
	}
}
class Downcase_ extends StringProcessor{
	@Override
	public String process(Object input) {
		// TODO Auto-generated method stub
		return ((String)input).toLowerCase();
	}
}
class Splitter_ extends StringProcessor{
	@Override
	public String process(Object input) {
		// TODO Auto-generated method stub
		return Arrays.toString(((String)input).split(" "));
	}
}