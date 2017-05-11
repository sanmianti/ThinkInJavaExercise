package unit5;

public class Exercise12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Tank(false);
		System.gc();
	}

}

class Tank{
	boolean isEmpty = true;
	
	public Tank(boolean isEmpty) {
		// TODO Auto-generated constructor stub
		this.isEmpty = isEmpty;
	}
	
	void setFull(){
		isEmpty = false;
	}
	
	void setEmpty(){
		isEmpty = true;
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		if (!isEmpty) {
			System.out.println("Error: Tank对象必须处于空状态！");
			super.finalize();
		}
		
	}
}