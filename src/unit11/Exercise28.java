package unit11;

import java.util.PriorityQueue;
import java.util.Random;

public class Exercise28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Double> doublePQ = new PriorityQueue<Double>();
		Random random = new Random(50);
		for(int i = 0; i < 10; i++){
			doublePQ.offer(random.nextDouble());
		}
		
		while(doublePQ.peek() != null){
			System.out.println(doublePQ.poll());
		}
	}

}
