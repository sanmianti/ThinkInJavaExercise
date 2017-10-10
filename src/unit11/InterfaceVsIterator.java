package unit11;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class InterfaceVsIterator {

	public static void display(Iterator<Pet> it){
		while(it.hasNext()){
			Pet pet = it.next();
			System.out.print(pet.id() + ":" + pet + " ");
		}
		System.out.println();
	}
	public static void display(Collection<Pet> pets){
		for (Pet pet : pets) {
			System.out.print(pet.id() + ":" + pet + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pet> petList = Pets.arrayList(8);
		Set<Pet> petSet = new HashSet<Pet>(petList);
		Map<String, Pet> petMap = new LinkedHashMap<String, Pet>();
		String[] names = "Ralph, Eric, Robin, Lacey, Britney, Sam, Spot, Fluffy".split(",");
		for(int i = 0; i < names.length; i++){
			petMap.put(names[i], petList.get(i));
		}
		display(petList);
		display(petSet);
		display(petList.iterator());
		display(petSet.iterator());
		System.out.println(petMap);
		System.out.println(petMap.keySet());
		display(petMap.values());
		display(petMap.values().iterator());
		
	}

}