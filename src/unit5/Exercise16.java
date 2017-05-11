package unit5;


public class Exercise16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test16 test16 = new Test16();
		test16.initStringArray();
		test16.printStringArray();
	}

}

class Test16{
	String[] strings = new String[10];
	
	void initStringArray(){
		for(int i = 0; i < strings.length; i++){
			strings[i] = "string" + i;
		}
	}
	
	void printStringArray(){
		for (String string : strings) {
			System.out.println(string);
		}
	}
}