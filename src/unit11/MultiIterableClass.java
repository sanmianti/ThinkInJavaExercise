package unit11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class MultiIterableClass  extends IterableClass{

	public Iterable<String> reversed(){
		return new Iterable<String>() {
			
			@Override
			public Iterator<String> iterator() {
				// TODO Auto-generated method stub
				return new Iterator<String>() {
					private int current = words.length;
					@Override
					public boolean hasNext() {
						// TODO Auto-generated method stub
						return current > 0;
					}
					@Override
					public String next() {
						// TODO Auto-generated method stub
						return words[--current];
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
	
	public Iterable<String> randomized(){
		return new Iterable<String>() {
			
			@Override
			public Iterator<String> iterator() {
				// TODO Auto-generated method stub
				List<String> shuffled = new ArrayList<String>(Arrays.asList(words));
				Collections.shuffle(shuffled, new Random(47));
				return shuffled.iterator();
//				String[] dest = new String[words.length];
//				System.arraycopy(words, 0, dest, 0, dest.length);
				
			}
		};
	}
	
	public static void main(String[] args){
		MultiIterableClass mIterableClass = new MultiIterableClass();
		for(String string : mIterableClass){
			System.out.print(string + " ");
		}
		System.out.println();
		for(String string : mIterableClass.reversed()){
			System.out.print(string + " ");
		}
		System.out.println();
		for(String string : mIterableClass.randomized()){
			System.out.print(string + " ");
		}
	}
}
