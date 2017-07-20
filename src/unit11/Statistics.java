package unit11;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Statistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random(47);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0 ; i < 10000; i++){
			int r = random.nextInt(20);
			Integer freq = map.get(r);
			
			//Concise code compare with below.
			map.put(r, freq == null? 1 : freq + 1);
//			if (freq == null) {
//				map.put(r, 1);
//			}else {
//				map.put(r, ++freq);
//			}
		}
		System.out.println(map);
	}

}
