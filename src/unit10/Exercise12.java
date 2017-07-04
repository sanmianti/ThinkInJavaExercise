package unit10;

public class Exercise12 {
	
	private int i = 12;
	public void f(){
		System.out.println("Exercise12.f()");
	
	}
	public void h(){
		new Object(){
			private void g() {
				// TODO Auto-generated method stub
				i ++;
				f();
			}
		}.g();
		System.out.println("i = " + i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exercise12().h();
	}

}
