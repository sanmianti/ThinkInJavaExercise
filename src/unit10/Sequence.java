package unit10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Sequence {

	private List<Object> items = new ArrayList<>();
	private int next = 0;
	public Sequence(int size) {
		// TODO Auto-generated constructor stub
		items = new ArrayList<>();
	}
	public void add(Object x){
		items.add(x);
	}
	
	private class SequenceSelector implements Selector{
		private int i = 0;
		@Override
		public boolean end() {
			// TODO Auto-generated method stub
			return i == items.size();
		}
		@Override
		public Object current() {
			// TODO Auto-generated method stub
			return items.get(i);
		}
		@Override
		public void next() {
			// TODO Auto-generated method stub
			if (i < items.size()) {
				i++;
			}
		}
		Sequence outer(){
			return new Sequence(10);
		}
	}
	private class ReverseSelector implements Selector{

		
		private int i = items.size() ;
		
		@Override
		public boolean end() {
			// TODO Auto-generated method stub
			return i == 0;
		}

		@Override
		public Object current() {
			// TODO Auto-generated method stub
//			return items[i-1];
			return items.get(i - 1);
		}

		@Override
		public void next() {
			// TODO Auto-generated method stub
			if (i > 0) {
				i--;
			}
			
		}
		
	}
	private class SequenceIterator implements Iterator<Object>{

		private int i;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return i < items.size();
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			if (hasNext()) {
				return items.get(i);
			}
			throw new NoSuchElementException();
		}
		
		@Override
		public void remove() {
			// TODO Auto-generated method stub
			throw new UnsupportedOperationException();
		}
	}
	
	public Selector selector(){
		return new SequenceSelector();
	}
	public Selector reverseSelector(){
		return new ReverseSelector();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//初始化一个长度为10的数组
		Sequence sequence = new Sequence(10);
		//数组赋值
		for(int i = 0; i < 10; i++){
			sequence.add(Integer.toString(i));
		}
		//获取迭代器
		Selector selector = sequence.selector();
		while (!selector.end()) {
			System.out.println(selector.current() + " ");
			selector.next();
			
		}
		Selector reverseSelector = sequence.reverseSelector();
		while (! reverseSelector.end()) {
			System.out.println(reverseSelector.current());
			reverseSelector.next();
		}
		
		
	}

}
interface Selector{
	boolean end();
	Object current();
	void next();
}