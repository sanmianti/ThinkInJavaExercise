package unit10;

public class BigEgg2 extends Egg2{
	
	public class Yolk extends Egg2.Yolk{
		public Yolk() {
			// TODO Auto-generated constructor stub
			System.out.println("BigEgg2.Yokl()");
		}
		public void f(){
			System.out.println("BigEgg2.Yolk.f()");
		}
	}
	public BigEgg2() {
		// TODO Auto-generated constructor stub
		super();
		insertyolk(new Yolk());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Egg2 e2 = new BigEgg2();
		e2.g();
	}

}
class Egg2{
	protected class Yolk{
		public Yolk() {
			// TODO Auto-generated constructor stub
			System.out.println("Egg2.Yolk()");
		}
		public void f() {
			System.out.println("Egg2.Yolk.f()");
		}
	}
	private Yolk yolk = new Yolk();
	public Egg2 () {
		System.out.println("new Egg2()");
	}
	public void insertyolk(Yolk yy){
		yolk = yy;
	}
	public void g(){
		yolk.f();
	}
}