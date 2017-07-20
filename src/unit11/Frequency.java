package unit11;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.asList(args));
		Map<String, Integer> m = new TreeMap<String, Integer>();
		for (String word : args) {
			Integer freq = m.get(word);
			m.put(word, (freq == null ? 1 : freq + 1));
		}
		System.out.println(m);
	}

}
