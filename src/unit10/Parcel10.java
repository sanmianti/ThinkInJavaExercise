package unit10;

public class Parcel10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel10 p10 = new Parcel10();
		Destination d = p10.destination("hello", 101.395f);
	}

	public Destination destination(String dest, float price){
		return new Destination() {
			private int cost;
			
			{
				cost = Math.round(price);
				if (cost > 100) {
					System.out.println("Over budget!");
				}
			}
			private String lable = dest;
			
			@Override
			public String readLabel() {
				// TODO Auto-generated method stub
				return lable;
			}
		};
	}
}
