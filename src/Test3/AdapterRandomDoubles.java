package Test3;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class AdapterRandomDoubles extends RandomDoubles 
implements Readable{

	private int count;
	public AdapterRandomDoubles(int count) {
		// TODO Auto-generated constructor stub
		this.count = count;
	}
	
	@Override
	public int read(CharBuffer cb) throws IOException {
		// TODO Auto-generated method stub
		if (count-- == 0) {
			return -1;
		}
		String result = Double.toString(next()) + " ";
		cb.append(result);
		return result.length();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(new AdapterRandomDoubles(7));
		while (scanner.hasNext()) {
			
			System.out.println(scanner.next());
		}
		scanner.close();
	}

}
