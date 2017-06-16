package test;

public class FieldAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super sup = new Sub(); //Upcast
		System.out.println("sup.field = " + sup.field + 
				".sup.getField() = " + sup.getField());
		
		Sub sub = new Sub();
		System.out.println("sub.field = " + 
				sub.field + ", sub.getField() = "+
				sub.getField() + 
				", sub.getSuperField() = " + 
				sub.getSupField());
	}

}

class Super{
	public int field = 0;
	public int getField(){
		return field;
	}
}
class Sub extends Super{
	public int field = 1;
	public int  getField() {
		return field;
	}
	public int  getSupField() {
		return super.getField();
	}
}