package unit11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class Exercise32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonCollectionSequences ncs = new NonCollectionSequences();
		System.out.println("Before iterator: " + Arrays.toString(ncs.petArray));
		for(Pet pet : ncs){
			System.out.print(pet + " ");
		}
		System.out.println();
		for(Pet pet : ncs.reveased()){
			System.out.print(pet + " ");
		}
		System.out.println();
		for(Pet pet : ncs.randomed()){
			System.out.print(pet + " ");
		}
	}

}

class PetSequences{
	Pet[] petArray = Pets.createArray(10);
}
class NonCollectionSequences  extends PetSequences implements Iterable<Pet>{

	@Override
	public Iterator<Pet> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<Pet>() {
			private int current = 0;
			@Override
			public Pet next() {
				// TODO Auto-generated method stub
				return petArray[current ++];
			}
			
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return current < petArray.length;
			}
			@Override
			public void remove() {
				// TODO Auto-generated method stub
				throw new UnsupportedOperationException();
			}
		};
	}
	public Iterable<Pet> reveased(){
		return new Iterable<Pet>() {
			
			@Override
			public Iterator<Pet> iterator() {
				// TODO Auto-generated method stub
				return new Iterator<Pet>() {
					private int current = petArray.length;
					@Override
					public boolean hasNext() {
						// TODO Auto-generated method stub
						return current > 0;
					}
					@Override
					public Pet next() {
						// TODO Auto-generated method stub
						return petArray[--current];
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
	
	public Iterable<Pet> randomed(){
		List<Pet> petList = new ArrayList<Pet>(Arrays.asList(petArray));
		Collections.shuffle(petList);
		return petList;
	}
	
}