package unit11;

import java.util.Iterator;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class NonCollectionSequence extends PetSequence{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonCollectionSequence nc = new NonCollectionSequence();
		InterfaceVsIterator.display(nc.iterator());
	}
	
	public Iterator<Pet> iterator(){
		return new Iterator<Pet>() {
			
			private int index;
			
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
			
		};
	}

}
class PetSequence{
	protected Pet[] pets = Pets.createArray(8);
}