package unit10;

public class Parcel6 {

	private void internalTracking(boolean b){
		if (b) {
			class TrackingSlip{
				private String id;
				public TrackingSlip(String s) {
					// TODO Auto-generated constructor stub
					id = s;
				}
				String getSlip(){ return id;}
			}
			TrackingSlip ts = new TrackingSlip("slip");
			String string = ts.getSlip();
		}
	}
	
	public void track(){
		internalTracking(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Parcel6().track();
	}

}
