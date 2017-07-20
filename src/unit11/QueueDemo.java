package unit11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueDemo {
	
	public static void printQ(Queue queue){
		while(queue.peek() != null){
			System.out.print(queue.remove() + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<Integer>();
		Random random = new Random(47);
		for(int i = 0; i < 10; i++){
			queue.offer(random.nextInt(i + 10));
		}
		printQ(queue); 
		Queue<Character> qc = new LinkedList<Character>();
		for(char c : "Brontosaurus".toCharArray()){
			qc.offer(c);
		}
		printQ(qc);
	}

}
