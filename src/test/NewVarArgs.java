package test;

public class NewVarArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prinArray(new Integer(45), new Float(3.14), new Double(11.11));
		prinArray(47, 3.14f, 11.11);
		prinArray("one", "two", "three");
		prinArray(new NewVarArgs(), new NewVarArgs(), new NewVarArgs());
		prinArray((Object[])new Integer[]{1, 2, 3, 4});
		prinArray();
		
		
		
		System.out.println(new Integer[]{12,23,34,});
	}
	
	static void prinArray(Object... args){
		
		for (Object object : args) {
			System.out.println(object + "");
		}
		System.out.println();
	}

}

