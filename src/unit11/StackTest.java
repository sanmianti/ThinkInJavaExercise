package unit11;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
		for(String s : "My dog has fleas".split(" ")){
			stack.push(s);
		}
		while(! stack.isEmpty()){
			System.out.println(stack.pop());
		}
	}

}
