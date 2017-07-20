package unit11;

import java.util.Iterator;
import java.util.List;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class SimpleIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pet> pets = Pets.arrayList(12);
		Iterator<Pet> it = pets.iterator();
		while(it.hasNext()){
			Pet pet = it.next();
			System.out.print(pet.id() + ":" + pet + " ");
		}
		System.out.println();
		
		for (Pet pet : pets) {
			System.out.print(pet.id() + ":" + pet + " ");
		}
		System.out.println();
		it = pets.iterator();
		for(int i = 0; i < 6; i++){
			it.next();
			it.remove();
		}
		
		System.out.println(pets);
	}

}
