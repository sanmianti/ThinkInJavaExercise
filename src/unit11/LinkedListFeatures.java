package unit11;

import java.util.ArrayList;
import java.util.LinkedList;

import typeinfo.pets.Hamster;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;
import typeinfo.pets.Rat;

public class LinkedListFeatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Pet> linkPets = new LinkedList<Pet>(Pets.arrayList(5));
		ArrayList<Pet> arrayPets = new ArrayList<Pet>(linkPets);
		System.out.println(linkPets);
		//Identical
		System.out.println("pets.getFirst(): " + linkPets.getFirst());
		System.out.println("pets.element(): " + linkPets.element());
		System.out.println(linkPets.getLast());
		//Only differs in empty-list behavior:
		System.out.println("linkPets.peek(): " + linkPets.peek());
		//Identical; remove and return the first element:
		System.out.println("linkPets.remove(): " + linkPets.remove());
		System.out.println("linkPets.removeFirst(): " + linkPets.removeFirst());
		//Only differs in empty-list behavior:
		System.out.println("pets.poll(): " + linkPets.poll());
		System.out.println(linkPets);
		linkPets.addFirst(new Rat());
		System.out.println("After addFirst(): " + linkPets);
		linkPets.offer(Pets.randomPet());
		System.out.println("After offer(): " + linkPets);
		linkPets.add(Pets.randomPet());
		System.out.println("After add():" + linkPets );
		linkPets.addLast(new Hamster());
		System.out.println("After addLast(): " + linkPets);
		System.out.println("linkPets.removeLast(): " + linkPets.removeLast());
		
		
	}

}
