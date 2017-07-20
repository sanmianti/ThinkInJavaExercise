package unit11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Exercise9 {
	
	private Object[] items;
	private int next;
	public Exercise9(int size){
		items = new Object[size];
	}
	public void add(Object x){
		if (next < items.length) {
			items[next ++ ] = x;
		}
	}
	
	private class SequenceIterator implements Iterator<Object>{
		private int i;
		public boolean hasNext(){
			return i < items.length;
		}
		@Override
		public Object next() {
			// TODO Auto-generated method stub
			if (hasNext()) {
				return items[i ++];
			}
			throw new NoSuchElementException();
		}
		@Override
		public void remove() {
			// TODO Auto-generated method stub
			throw new UnsupportedOperationException();
		}
	}
	public Iterator<Object> iterator(){
		return new SequenceIterator();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise9 e9 = new Exercise9(10);
		for(int i = 0; i < 10; i++){
			e9.add(Integer.toString(i));
			
		}
		for(Iterator<Object> it = e9.iterator(); it.hasNext();){
			System.out.println(it.next() + " ");
		}
		
	}

}
