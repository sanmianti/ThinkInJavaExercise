package unit5;

public class Exercise20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test20.main("zhangsan", "lisi", "wangwu");
		System.out.println();
		Test20.main("aa", "bb", "cc", "dd");
	}

}

class Test20{
	public static void main(String...strings){
		for (String string : strings) {
			System.out.println(string);
		}
	}
}
