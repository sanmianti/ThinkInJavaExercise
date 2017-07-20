package unit11;

import java.util.List;
import java.util.ListIterator;

import typeinfo.pets.Individual;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class ListIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pet> pets = Pets.arrayList(8);
		ListIterator it = pets.listIterator();
		while(it.hasNext()){
			System.out.println(it.next() + ", " + it.nextIndex() + ", " + it.previousIndex() + "; ");
		}
		while(it.hasPrevious()){
			System.out.println(((Pet) it.previous()).id() + " ");
		}
		System.out.println(pets);
		it = pets.listIterator(3);
		while(it.hasNext()){
			it.next();
			it.set(Pets.randomPet());
		}
		System.out.println(pets);
	}

}
