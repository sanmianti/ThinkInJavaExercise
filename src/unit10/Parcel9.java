package unit10;

public class Parcel9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel9 p9 = new Parcel9();
		Destination d = p9.destination("hello");
	}

	public Destination destination(String dest){
		return new Destination() {
			private String label = dest;
			@Override
			public String readLabel() {
				// TODO Auto-generated method stub
				return label;
			}
		};
	}
}
