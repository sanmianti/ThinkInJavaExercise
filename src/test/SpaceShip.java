package test;

public class SpaceShip extends SpaceShipControls{
	private String name;
	
	public SpaceShip(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}

	public static void main(String args[]){
		SpaceShip ship = new SpaceShip("NSEA protector");
		ship.forward(1000);
	}
}