package unit11;

import java.util.Stack;

public class StackCollision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		unit11.Stack<String> stack = new unit11.Stack<String>();
		
		for(String s : "My dog has fleas".split(" ")){
			stack.push(s);
		}
		while(!stack.empty()){
			System.out.println(stack.pop());
		}
		java.util.Stack<String> stack2 = new java.util.Stack<String>();
		for(String s : "My dog has fleas".split(" ")){
			stack.push(s);
		}
		while(! stack.empty()){
			System.out.println(stack.pop());
		}
	}

}
