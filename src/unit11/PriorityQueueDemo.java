package unit11;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
		Random random = new Random(47);
		for(int i = 0; i < 10; i++){
			priorityQueue.offer(random.nextInt(i + 10));
		}
		QueueDemo.printQ(priorityQueue);
		
		List<Integer> integers = Arrays.asList(25, 22, 20, 18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
		priorityQueue = new PriorityQueue<Integer>(integers);
		QueueDemo.printQ(priorityQueue);
		
		priorityQueue = new PriorityQueue<Integer>(integers.size(), Collections.reverseOrder());
		priorityQueue.addAll(integers);
		QueueDemo.printQ(priorityQueue);
		
		String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
		List<String> strings = Arrays.asList(fact.split(" "));
		PriorityQueue<String> stringPQ = new PriorityQueue<String>(strings);
		QueueDemo.printQ(stringPQ);
		stringPQ = new PriorityQueue<String>(strings.size(), Collections.reverseOrder());
		stringPQ.addAll(strings);
		QueueDemo.printQ(stringPQ);
		
		Set<Character> charSet = new HashSet<Character>();
		for(Character c : fact.toCharArray()){
			charSet.add(c);
		}
		System.out.println(charSet);
		PriorityQueue<Character> characterPQ = new PriorityQueue<Character>(charSet);
		QueueDemo.printQ(characterPQ);
		
		characterPQ = new PriorityQueue<>(charSet.size(), Collections.reverseOrder());
		characterPQ.addAll(charSet);
		QueueDemo.printQ(characterPQ);
		
		PriorityQueue<Sodier> sodiers = new PriorityQueue<Sodier>();
		for(int i = 0; i < 10; i++){
			sodiers.offer(new Sodier(random.nextInt(i + 20 ) + 20));
		}
		QueueDemo.printQ(sodiers);
		
	}

}

class Sodier implements Comparable<Sodier>{
	int age;
	public Sodier(int age) {
		// TODO Auto-generated constructor stub
		this.age = age;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return age + "";
	}

	@Override
	public int compareTo(Sodier o) {
		// TODO Auto-generated method stub
		return o.age - this.age;
	}
}
