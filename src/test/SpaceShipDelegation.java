package test;

public class SpaceShipDelegation {

	private String name;
	private SpaceShipControls controls = new SpaceShipControls();
	
	public SpaceShipDelegation(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	public void back(int velocity){
		controls.back(velocity);
	}
	public void down(int velocity){
		controls.down(velocity);
	}
	public void forword(int velocity){
		controls.forward(velocity);
	}
	public void left(int velocity){
		controls.left(velocity);
	}
	public void ritht(int velocity){
		controls.right(velocity);
	}
	public void turboBoost(int velocity){
		controls.turboBoost();
	}
	public void up(int velocity){
		controls.up(velocity);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SpaceShipDelegation protector = new SpaceShipDelegation("NSEA protector");
		protector.forword(1000);
	}

}
