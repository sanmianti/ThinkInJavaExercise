package unit11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieGenerator mg = new MovieGenerator();
		String[] movie1 = new String[10];
		List<String> movie2 = new ArrayList<String>();
		List<String> movie3 = new LinkedList<String>();
		Set<String> movie4 = new HashSet<String>(); 
		Set<String> movie5 = new LinkedHashSet<String>();
		Set<String> movie6 = new TreeSet<String>();
		
		for(int i = 0; i < 10; i++){
			String movie = mg.next();
			movie1[i] = movie;
			movie2.add(movie);
			movie3.add(movie);
			movie4.add(movie);
			movie5.add(movie);
			movie6.add(movie);
		}
		
		System.out.println(Arrays.asList(movie1));
		System.out.println(movie2);
		System.out.println(movie3);
		System.out.println(movie4);
		System.out.println(movie5);
		System.out.println(movie6);
	}

}
class MovieGenerator {
	
	String[] movies = {"教父", "灿烂人生", "Hello, 树先生", "霸王别姬", "肖申克的救赎"};
	int next;
	public String next(){
//		String m;
//		if (next < movies.length) {
//			m = movies[next];
//			++next;
//		}else {
//			next = 0;
//			return next();
//		}
		return movies[ next++ % movies.length];
	}
	
}
