package unit11;

import java.util.Arrays;
import java.util.List;

public class Exercise15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
		String s = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
		
		//First method
		for(int i = 0; i < s.length(); i++){
			Character c = s.charAt(i);
			if (c.equals('+') ) {
				if (i < s.length() - 1) {
					stack.push(s.charAt(i + 1) + "");
				}
				
			}else if (c.equals('-')) {
				System.out.print(stack.pop());
			}
		}
		
		System.out.println();
		stack.clear();
		
		//Second method
		char chars[] = s.toCharArray();
		for(int i = 0; i < chars.length; i++){
			switch (chars[i]) {
			case '+':
				stack.push(chars[++i] + "");
				break;
			case '-':
				System.out.print(stack.pop());
				break;
			default:
				break;
			}
		}
		
	}

}
