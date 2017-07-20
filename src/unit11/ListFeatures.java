package unit11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import typeinfo.pets.Cymric;
import typeinfo.pets.Hamster;
import typeinfo.pets.Mouse;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class ListFeatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random(47);
		List<Pet> pets = Pets.arrayList(7);
		System.out.println("1: " + pets);
		Hamster hamster = new Hamster();
		pets.add(hamster);
		System.out.println("2: " + pets);
		System.out.println("3: " + pets.contains(hamster));
		pets.remove(hamster);
		Pet pet = pets.get(2);
		System.out.println("4: " + pet + pets.indexOf(pet));
		Pet cymric = new Cymric();
		System.out.println("5: " + pets.indexOf(cymric));
		System.out.println("6: " + pets.remove(cymric));
		System.out.println("7: " + pets.remove(pet));
		System.out.println("8: " + pets);
		pets.add(3, new Mouse());
		System.out.println("9：" + pets);
		List<Pet> sub = pets.subList(1, 4);
		System.out.println("sublist: " + sub);
		System.out.println("10: " + pets.containsAll(sub));
		System.out.println("11: " + pets.contains(sub));
		Collections.sort(sub);
		System.out.println("souted subList: " + sub);
		System.out.println("12: " + pets.containsAll(sub));
		Collections.shuffle(sub, random);
		System.out.println("shuffled subList: " + sub);
		System.out.println("13: " + pets.containsAll(sub));
		List<Pet> copy = new ArrayList<Pet>(pets);
		sub = Arrays.asList(pets.get(1), pets.get(4));
		System.out.println("sub:" + sub);
		copy.retainAll(sub);
		System.out.println("14: " + copy);
		copy = new ArrayList<Pet>(pets);
		copy.remove(2);
		System.out.println("15: " + copy);
		copy.removeAll(sub);
		System.out.println("16: " + copy);
		copy.set(1, new Mouse());
		System.out.println("17： " + copy);
		copy.addAll(2, sub);
		System.out.println("18: " + copy);
		System.out.println("19: " + pets.isEmpty());
		pets.clear();
		System.out.println("20: " + pets);
		System.out.println("21: " + copy.isEmpty());
		pets.addAll(Pets.arrayList(4));
		System.out.println("22: " + pets);
		Object[] o = pets.toArray();
		System.out.println("23: " + o[3]);
		Pet[] pa = pets.toArray(new Pet[0]);
		System.out.println("24: " + pa[3].id());
		
		
	}

}
