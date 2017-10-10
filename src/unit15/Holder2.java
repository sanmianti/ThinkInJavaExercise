package unit15;

public class Holder2 {
	private Object a;
	public Holder2(Object a) {
		// TODO Auto-generated constructor stub
		this.a = a;
	}
	public void setA(Object a) {
		this.a = a;
	}public Object getA() {
		return a;
	}public Holder2() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args){
		Holder2 h2 = new Holder2(new Automobile());
		Automobile a = (Automobile)h2.getA();
		h2.setA("Not a Automobile");
		String s = (String)h2.getA();
		h2.setA(1);
		Integer x = (Integer)h2.getA();
	}
}
