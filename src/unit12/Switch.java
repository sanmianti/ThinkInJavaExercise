package unit12;

public class Switch {

	private boolean state = false;
	public boolean read(){ 
		return state;
	}
	public void on(){ 
		state = true;
		System.out.println(this);
	}
	public void off(){
		state = false;
		System.out.println(this);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return state ? "on" : "off";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

class OnOffException1 extends Exception{}
class OnOffException2 extends Exception{}