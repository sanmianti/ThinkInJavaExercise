package test;

public class Orc extends Villain{

	private int orcNumber;
	
	public Orc(String name, int ourNmuber) {
		// TODO Auto-generated constructor stub
		super(name);
		this.orcNumber = orcNumber;
		
	}
	
	public void change(String name, int orcNumber){
		set(name);
		this.orcNumber = orcNumber;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Orc" + orcNumber + ":" + super.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orc orc = new Orc("zhangsan", 12);
		System.out.println(orc);
		orc.change("lisi", 19);
		System.out.println(orc);
	}

}
class Villain{
	private String name;
    void set(String name){
		this.name = name;
	}
	public Villain(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "I'm a Villain and my name is" + name;
	}
}