package unit10;

import javax.print.attribute.standard.RequestingUserName;

import unit10.Parcel4.PDestination;

public class Parcel5 {

	public Destination destination(String s){
		class Pdestination implements Destination{
			private String label;
			private Pdestination(String whereTo){
				this.label = whereTo;
			}
			@Override
			public String readLabel() {
				// TODO Auto-generated method stub
				return label;
			}
		}
		return new Pdestination(s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel5 parcel5 = new Parcel5();
		Destination d = parcel5.destination("Tasmania");
	}

}
