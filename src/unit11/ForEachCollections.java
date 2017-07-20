package unit11;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ForEachCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> cs = new LinkedList<String>();
		Collections.addAll(cs, "Take the long way home".split(" "));
		
		for (String string : cs) {
			System.out.println("'" + string + "' ");
		}

	}

}
