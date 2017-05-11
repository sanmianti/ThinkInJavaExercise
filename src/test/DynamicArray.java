package test;

public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Other.main(new String[]{"fiddle", "de", "dum"});
	}

}

class Other{
	public static void main(String[] args){
		for (String string : args) {
			System.out.println(string + "");
		}
	}
}