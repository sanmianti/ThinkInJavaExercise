package unit11;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Exercise9Copy {
	
	private Object[] items;
	private int next;
	public Exercise9Copy(int size){
		items = new Object[size];
	}
	public void add(Object x){
		if (next < items.length) {
			items[next ++ ] = x;
		}
	}
	
	public Iterator<Object> iterator(){
		return new E9cIterator();
	}
	
	private class E9cIterator implements Iterator<Object>{
		
		private int i;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int itemSize = 15;
		Exercise9Copy e9c = new Exercise9Copy(itemSize);
		for(int i = 0; i < itemSize; i++){
			e9c.add(i);
		}
		Iterator  iterator = e9c.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
	}

}
