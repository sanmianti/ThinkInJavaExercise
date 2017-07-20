package unit11;

import java.util.Iterator;

public class IterableClass implements Iterable<String>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IterableClass ic = new IterableClass();
		for (String string : ic) {
			System.out.println(string);
		}
	}
	
	protected String[] words = ("And that is how we know "
			+ "the Earth to be banna-shaped.").split(" ");
	
	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<String>() {

			private int index = 0;	
			
			@Override
			public boolean hasNext() {
				
				// TODO Auto-generated method stub
				return index < words.length;
			}

			@Override
			public String next() {
				// TODO Auto-generated method stub
				return words[index++];
			}
			
			@Override
			public void remove() {
				// TODO Auto-generated method stub
				throw new UnsupportedOperationException();
			}
			
		};
	}

}
