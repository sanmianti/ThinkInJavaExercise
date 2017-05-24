package unit7;

public class Exercise1 {

	static Test1 test1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (test1 == null) {
			test1 = Test1.getInstance();
		}
		
		System.out.println(test1);
	}

}

class Test1{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Test1";
	}
	
	static Test1 getInstance(){
		return new Test1();
	}
}