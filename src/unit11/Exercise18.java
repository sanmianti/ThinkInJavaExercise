package unit11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
/**
 * 
 * @author zlm
 *
 */
public class Exercise18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for(int i = 0 ; i < 10; i++){
			hashMap.put(i, i * i);
		}
		System.out.println(hashMap);
		Set<Integer> keySet = new TreeSet<Integer>(hashMap.keySet());
		Set<Integer> valueSet = new HashSet<Integer>();
		for(Integer i : keySet){
			valueSet.add(hashMap.get(i));
		}
		System.out.println(keySet);
		System.out.println(valueSet);
		
		Map<Integer, Integer> linkedHashMap = new LinkedHashMap<Integer, Integer>();
		for(Integer i : keySet){
			linkedHashMap.put(i, hashMap.get(i));
		}
		System.out.println(linkedHashMap);
	
	}

}
