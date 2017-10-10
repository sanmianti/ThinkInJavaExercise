package unit13;

import java.io.File;

import net.mindview.util.BinaryFile;

public class Hex {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		if (args.length == 0) {
			System.out.println(format(BinaryFile.read("./bin/unit13/Hex.class")));
		}else {
			System.out.println(format(BinaryFile.read(new File(args[0]))));
		}

	}
	public static String format(byte[] data){
		StringBuilder result = new StringBuilder();
		int n = 0;
		for (byte b : data) {
			if (n % 16 == 0) {
				result.append(String.format("%5X: ", n));
			}
			result.append(String.format("%2X", b));
			n++;
			if (n % 16 == 0) {
				result.append("\n");
			}
		}
		result.append("\n");
		return result.toString();
	}

}
