package unit11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class AdapterMethodIdiom<T> extends ArrayList<T>{

	public static void main(String[] args){
		ReversibleArrayList<String> ral = new ReversibleArrayList(Arrays.asList("To be or not to be".split(" ")));
		for (String string : ral) {
			System.out.print(string + " ");
		}
		System.out.println();
		for(String string : ral.reversed()){
			System.out.print(string + " ");
		}
	}
}

class ReversibleArrayList<T> extends ArrayList<T>{

	public ReversibleArrayList(Collection<T> c) {
		// TODO Auto-generated constructor stub
		super(c);
	}
	public Iterable<T> reversed(){
		return new Iterable<T>() {

			@Override
			public Iterator<T> iterator() {
				// TODO Auto-generated method stub
				
				return new Iterator<T>() {
					private int current = size();
					@Override
					public boolean hasNext() {
						// TODO Auto-generated method stub
						return current > 0;
					}
					@Override
					public T next() {
						// TODO Auto-generated method stub
						return get(--current);
					}
					@Override
					public void remove() {
						// TODO Auto-generated method stub
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}
}