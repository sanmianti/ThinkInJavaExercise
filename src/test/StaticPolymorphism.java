package test;

public class StaticPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StaticSuper sup = new StaticSub();//Upcast
//		System.out.println(sup.staticGet());
//		System.out.println(sup.dnyamicGet());
		new StaticSub();
	}

}

class StaticSuper extends SuperStaticSuper{
	public static String staticGet(){
		return "Base staticGet()";
	}
	
	public String dnyamicGet(){
		return "Base dynamicGet";
	}
	public StaticSuper() {
		// TODO Auto-generated constructor stub
		System.out.println("StaticSuper constructor");
	}
}

class StaticSub extends StaticSuper{
	public static String staticGet(){
		return "Derived staticGet()";
	}
	
	@Override
	public String dnyamicGet() {
		// TODO Auto-generated method stub
		return "Derived dynamicGet()";
	}
	
	public StaticSub() {
		// TODO Auto-generated constructor stub
		System.out.println("StaticSub constructor");
	}
}
class SuperStaticSuper{
	public SuperStaticSuper() {
		// TODO Auto-generated constructor stub
	
		System.out.println("SuperStaticSuper constructor");
	}
}