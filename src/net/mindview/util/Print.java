package net.mindview.util;

import java.io.PrintStream;

public class Print {

	//print with o newline
	public static void print(Object object){
		System.out.println(object);
	}
	
	//print a newline by itself
	public static void print(){
		System.out.println();
	}
	
	//print with no line break
	public static void printnb(Object obj){
		System.out.print(obj);
	}
	
	//The new Java SE5 printf()
	public static PrintStream printf(String format, Object...objects){
		return System.out.printf(format, objects);
	}
}
