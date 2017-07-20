package unit11;

import java.util.HashMap;
import java.util.Random;

public class Exercise18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> studentScore = new HashMap<String, Integer>();
		Random random = new Random(47);
		for(String s : "张三 李四 王五 陈六 赵七 周八".split(" ")){
			studentScore.put(s, random.nextInt(100));
		}
		System.out.println(studentScore);
	}

}
