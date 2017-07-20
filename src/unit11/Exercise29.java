package unit11;

import java.util.PriorityQueue;

public class Exercise29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Test29> pQueue = new PriorityQueue<Test29>();
		//Exception in thread "main" java.lang.ClassCastException: 
		//unit11.Test29 cannot be cast to java.lang.Comparable
		pQueue.offer(new Test29());
		pQueue.offer(new Test29());
	}

}

class Test29 {
	
}