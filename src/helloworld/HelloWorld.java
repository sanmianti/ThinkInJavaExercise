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
	
	
	public static void main(String[] args){
		try {
			throw new RuntimeException();
		} catch (RuntimeException e) {
			// TODO: handle exception
			
		}finally {
			System.out.println("finally block");
		}
	}
	
	
}

class MyException extends Exception{}