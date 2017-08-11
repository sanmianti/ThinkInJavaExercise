package unit12;

import java.util.Arrays;
import java.util.List;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> integerList= Arrays.asList(1, 2, 3);
		int i;
		try{
			i = integerList.get(3);
		}catch(IndexOutOfBoundsException e){
			e.printStackTrace();
		}
	}

}
