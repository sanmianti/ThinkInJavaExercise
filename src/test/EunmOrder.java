package test;

public class EunmOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Spiciness spiciness : Spiciness.values()){
			System.out.println(spiciness + ", ordinal" + spiciness.ordinal());
		}
	}

}
