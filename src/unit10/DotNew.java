package unit10;

public class DotNew {

	class Inner{}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DotNew dn = new DotNew();
		DotNew.Inner dni = dn.new Inner();
	}

}
