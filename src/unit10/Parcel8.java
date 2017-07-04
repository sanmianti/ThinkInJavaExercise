package unit10;

public class Parcel8 {

	public Wrapping wrapping(int x){
		return new Wrapping(x){
			@Override
			public int value() {
				// TODO Auto-generated method stub
				return super.value() * 47;
			}
		};
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel8 parcel8 = new Parcel8();
		Wrapping w = parcel8.wrapping(111);
	}

}

class Wrapping{
	private int i;
	public Wrapping(int x){
		this.i = x;
	}
	public int value(){
		return i;
	}
}
