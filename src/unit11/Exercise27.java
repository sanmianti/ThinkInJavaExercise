package unit11;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommandInitialization ci = new CommandInitialization();
		CommandConsumer cc = new CommandConsumer();
		cc.consume(ci.initializeCommand());
	}

}
class Command {
	String s = null;
	
	public Command(String s) {
		// TODO Auto-generated constructor stub
		this.s = s;
	}
	
	public void operation(){
		System.out.println(s);
	}
}
class CommandInitialization{
	public Queue<Command> initializeCommand(){
		Queue<Command> queue = new LinkedList<Command>();
		for(char c : "hello".toCharArray()){
			queue.offer(new Command(c + ""));
		}
		return queue;
	}
}
class CommandConsumer{
	public void consume(Queue<Command> queue){
		while(queue.peek() != null){
			queue.remove().operation();
		}
	}
}