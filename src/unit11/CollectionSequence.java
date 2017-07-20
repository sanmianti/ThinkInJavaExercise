package unit11;

import java.util.AbstractCollection;
import java.util.Iterator;

import org.omg.CORBA.PUBLIC_MEMBER;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class CollectionSequence extends AbstractCollection<Pet>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionSequence c = new CollectionSequence();
		InterfaceVsIterator.display(c);
		InterfaceVsIterator.display(c.iterator());
	}
	
	private Pet[] pets = Pets.createArray(8);

	@Override
	public Iterator<Pet> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<Pet>() {
			private int index = 0;
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return index < pets.length;
			}
			@Override
			public Pet next() {
				// TODO Auto-generated method stub
				return pets[index ++];
			}
			@Override
			public void remove() {
				// TODO Auto-generated method stub
				throw new UnsupportedOperationException();
			}
		};
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return pets.length;
	}

}
