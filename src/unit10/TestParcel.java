package unit10;

public class TestParcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel4 parcel4 = new Parcel4();
		Contents contents = parcel4.contents();
		Destination destination = parcel4.destination("hehe");
		System.out.println(contents.value());
		System.out.println(destination.readLabel());
	}

}

class Parcel4{
	private class PContents implements Contents{
		private int i = 11;
		@Override
		public int value() {
			// TODO Auto-generated method stub
			return i;
		}
		
	}
	
	protected class PDestination implements Destination{
		private String label;
		public PDestination(String whereTo) {
			// TODO Auto-generated constructor stub
			label = whereTo;
		}
		@Override
		public String readLabel() {
			// TODO Auto-generated method stub
			return label;
		}
		
		
	}
	public Destination destination(String s){
		return new PDestination(s);
	}
	public Contents contents(){
		return new PContents();
	}
}