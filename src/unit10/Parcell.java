package unit10;

public class Parcell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcell p = new Parcell();
		p.ship("Tasmania");
	}

	class Contents{
		private int i = 11;
		public int value(){ return i; }
	}
	class Destination{
		private String label;
		public Destination(String label) {
			// TODO Auto-generated constructor stub
			this.label = label;
		}
		String readLabel(){ return label; }
	}
	
	public void ship(String dest){
		Contents c = new Contents();
		Destination d = new Destination(dest);
		System.out.println(d.readLabel());
	}
}
