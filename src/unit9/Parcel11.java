package unit9;

import unit10.Contents;
import unit10.Destination;

public class Parcel11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contents contents = contents();
		Destination d = destination("good");
	}

	private static class ParcelContents implements Contents{
		private int i = 11;
		@Override
		public int value() {
			// TODO Auto-generated method stub
			return i;
		}
		
	}
	protected static class ParcelDestination implements Destination{
		
		private String label;
		private  ParcelDestination(String whereTo) {
			// TODO Auto-generated constructor stub
			label = whereTo;
		}
		@Override
		public String readLabel() {
			// TODO Auto-generated method stub
			return label;
		}
		public static void f(){}
		static int x = 10;
		static class AnotherLevel{
			public static void f(){}
			static int x = 10;
		}
	}
	public static Destination destination(String s){
		return new ParcelDestination(s);
	}
	public static Contents contents(){
		return new ParcelContents();
		
	}
}
