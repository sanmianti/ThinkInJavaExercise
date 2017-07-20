package helloworld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

import javax.swing.text.Position.Bias;

import org.omg.CORBA.MARSHAL;

public class HelloWorld {
	
	static Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	
	public static boolean cotainsAll(Integer[] i){
		for (Integer integer : i) {
			boolean hasSingle = false;
			for (Integer i2 : integers) {
				if (integer.equals(i2)) {
					hasSingle = true;
				}
			}
			if (!hasSingle) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		Integer[] i1 = {2, 5, 6, 13};
		System.out.println(cotainsAll(new Integer[]{1, 4}));
	}
	
	
}

