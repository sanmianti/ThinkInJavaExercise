package unit11;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;
import unit6.exercise3.debug.Exercise3;

public class Exercise30 implements Collection<Pet>{

	Pet[] listPets = Pets.createArray(10);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise30 exercise30 = new Exercise30();
		System.out.println(Arrays.toString(exercise30.listPets));
		System.out.println(exercise30.contains(new Pet("Rat") ));
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return listPets.length;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return listPets.length == 0;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		for (Pet pet : listPets) {
			if (o.equals(pet)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Iterator<Pet> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<Pet>() {
			private int index;
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return index < listPets.length;
			}

			@Override
			public Pet next() {
				// TODO Auto-generated method stub
				return listPets[index ++];
			}
			@Override
			public void remove() {
				// TODO Auto-generated method stub
				throw new UnsupportedOperationException();
			}
		};
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		Object[] result = new Object[listPets.length];
		System.arraycopy(listPets, 0, result, 0, listPets.length);
		return result;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		if (a.length < listPets.length) {
			a = (T[]) Array.newInstance(a.getClass().getComponentType(), listPets.length);
		}
		T[] result = a;
		System.arraycopy(listPets, 0, result, 0, listPets.length);
		
		if (result.length > listPets.length) {
			result[listPets.length] = null;
		}
		return result;
	}

	@Override
	public boolean add(Pet e) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException(); 
				
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		for (Object object : c) {
			boolean hasSingle = false;
			for (Pet pet : listPets) {
				if (c.equals(pet)) {
					hasSingle = true;
				}
			}
			if (! hasSingle) {
				return false;
			}
		}
		
		return true;
	}

	@Override
	public boolean addAll(Collection<? extends Pet> c) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

}
