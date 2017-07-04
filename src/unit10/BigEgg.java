package unit10;

public class BigEgg extends Egg{
	
	public class Yolk{
		public Yolk() {
			// TODO Auto-generated constructor stub
			System.out.println("BigEgg.Yolk()");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BigEgg();
	}

}
class Egg{
	private Yolk y;
	protected class Yolk{
	public Yolk() {
		// TODO Auto-generated constructor stub
		System.err.println("Egg.Yolk()");
	}	
	}
	public Egg() {
		// TODO Auto-generated constructor stub
		System.out.println("New Egg()");
		y = new Yolk();
	}
}