package unit8;

import java.util.Random;

public class Exercise16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertStatus status = new AlertStatus();
		status.gotoCompany();
		status.changeStatus();
		status.gotoCompany();
		
	}

}


class AlertStatus{
	Vehicles vehicles = new Car();

	void gotoCompany(){
		vehicles.go();
	}
	
	void changeStatus(){
		int i = new Random().nextInt(3);
		switch (i) {
		case 0:
			vehicles = new Car();
			break;
		case 1:
			vehicles = new Motorcycle();
			break;
		default:
			vehicles = new Subway();
			break;
		}
	}
}
class Vehicles{
	
	void go(){
		System.out.println("Go to company by Vehicle");
	}
	
}

class Car extends Vehicles{
	@Override
	void go() {
		// TODO Auto-generated method stub
		System.out.println("Go to company by Car");
	}
}

class Subway extends Vehicles{
	@Override
	void go() {
		// TODO Auto-generated method stub
		System.out.println("Go to company by Subway");
	}
}

class Motorcycle extends Vehicles{
	@Override
	void go() {
		// TODO Auto-generated method stub
		System.out.println("Go to company by Motorcycle");
	}
}