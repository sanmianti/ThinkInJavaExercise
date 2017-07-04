package unit10;

import unit10.Parcel2.Contents;

public class Parcel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel2 p = new Parcel2();
		p.ship("Tasmania");
		Parcel2 q = new Parcel2();
		Contents c = q.contents();
		Destination d = q.to("Borneo");
	}
	
	class Contents{
		private int i = 11;
		public int value(){ return i; }
	}
	class Destination{
		private String label;
		public Destination(String whereTo) {
			// TODO Auto-generated constructor stub
			label = whereTo;
		}
		String readLabel(){ return label; }
	}

	public Destination to(String s){
		return new Destination(s);
	}
	public Contents contents(){
		return new Contents();
	}
	public void ship(String dest){
		Contents c = contents();
		Destination destination = to(dest);
		System.out.println(destination.readLabel());
	}
}
