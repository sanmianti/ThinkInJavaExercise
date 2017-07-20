package unit11;

import java.util.LinkedList;

public class Stack <T>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}
	
	private LinkedList<T> storage = new LinkedList<T>();
	public void push(T v){
		storage.addFirst(v);
	}
	public T peek(){
		return storage.getFirst();
	}
	public T pop(){
		return storage.removeFirst();
	}
	public boolean empty(){
		return storage.isEmpty();
	}
	public String toString(){
		return storage.toString();
	}
	public int size(){
		return storage.size();
	}
	public void clear(){
		storage.clear();
	}
}
