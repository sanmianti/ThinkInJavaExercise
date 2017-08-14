package unit12;

public class NeverCaught {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		g();
	}

	static void g(){
		f();
	}
	static void f(){
		throw new RuntimeException("from f()");
	}
}
