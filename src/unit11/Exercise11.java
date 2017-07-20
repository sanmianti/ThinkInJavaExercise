package unit11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Exercise11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List
		List<Account> arrayList = new ArrayList<Account>();
		List<Account> linkedList = new LinkedList<Account>();
		Set<Account> hashSet = new HashSet<Account>();
		Set<Account> treeSet = new TreeSet<Account>();
		for(char c ='a'; c < 'g'; ++c){
			Account a = new Account(Character.toString(c));
			arrayList.add(a);
			linkedList.add(a);
			hashSet.add(a);
			treeSet.add(a);
		}
		traversal(arrayList);
		traversal(linkedList);
		traversal(hashSet);
		traversal(treeSet);
		
		//Set
		
	}
	
	public static void traversal(Collection<Account> collection){
	
		Iterator<Account> iterator = collection.iterator();
		while(iterator.hasNext()){
			Account a = iterator.next();
			System.out.print(a);
		}
		System.out.println();
	}
}

class Account implements Comparable<Account>{
	String name;
	public Account(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public int compareTo(Account o) {
		// TODO Auto-generated method stub
		return 1;
	}
}
