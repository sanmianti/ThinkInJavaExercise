package unit11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Exercise17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, GerbilCopy> gerMap = new HashMap<String, GerbilCopy>();
		
		for (String string : "AA BB CC DD EE FF GG".split(" ")) {
			gerMap.put(string, new GerbilCopy(string));
		}
		Set<String> keySet = gerMap.keySet();
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()){
			String key = iterator.next();
			gerMap.get(key).hop();
			System.out.println(key);
		}
	}

}
class GerbilCopy{
	static int counter;
	final int gerbilNumber = ++ counter;
	private String name;
	public GerbilCopy(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	public void hop(){
		System.out.println(gerbilNumber);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
}