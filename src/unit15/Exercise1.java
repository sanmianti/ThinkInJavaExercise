package unit15;

import typeinfo.pets.Cat;
import typeinfo.pets.Pet;

public class Exercise1 {
	
	public static void main(String[] args){
		Holder3<Pet> holder3 = new Holder3<Pet>();
		holder3.set(new Cat());
		Cat cat = (Cat) holder3.get();
		System.out.println(cat);
	}
}


class Test1{}
class SubTest1{};