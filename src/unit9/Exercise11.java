package unit9;

import test2.Apply;
import test2.MProcessor;

public class Exercise11 {

	public static void main(String[] args){
		Apply.process(new Test11(), "abcdefghijk");
		Apply.process(new Test11Adapter(new Test11_()), "hello world");
	}
	
	
	
}

class Test11 implements MProcessor{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName();
	}

	@Override
	public Object process(Object input) {
		// TODO Auto-generated method stub
		return exchangeAlphabet((String)input);
	}
	
	public String exchangeAlphabet(String s){
		StringBuilder sb = new StringBuilder(s);
		for(int i = 0; i < s.length(); i+=2){
			if (i == s.length()-1) {
				return sb.toString();
			}
			char c1 = sb.charAt(i);
			char c2 = sb.charAt(i+1);
			sb.setCharAt(i, c2);
			sb.setCharAt(i + 1, c1);
			
			
		}
		return sb.toString();
	}
	
}

class Test11Adapter implements MProcessor{
	Test11_ test11;
	public Test11Adapter(Test11_ test11_) {
		// TODO Auto-generated constructor stub
		test11 = test11_;
	}
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return test11.getClass().getSimpleName();
	}

	@Override
	public Object process(Object input) {
		// TODO Auto-generated method stub
		return test11.exchangeAlphabet((String)input);
	}
	
}
//适配器模式
class Test11_{
	
	public String exchangeAlphabet(String s){
		StringBuilder sb = new StringBuilder(s);
		for(int i = 0; i < s.length(); i+=2){
			if (i == s.length()-1) {
				return sb.toString();
			}
			char c1 = sb.charAt(i);
			char c2 = sb.charAt(i+1);
			sb.setCharAt(i, c2);
			sb.setCharAt(i + 1, c1);
			
			
		}
		return sb.toString();
	}
}
