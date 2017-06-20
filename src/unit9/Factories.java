package unit9;

public class Factories {
	public static void serviceConsumer(ServiceFactory fact){
		Service service = fact.getService();
		service.method1();
		service.method2();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		serviceConsumer(new ImplementationalFactory());
		serviceConsumer(new Implementation2Factory());
	}

}
interface Service{
	void method1();
	void method2();
}
interface ServiceFactory{
	Service getService();
}
class Implementational implements Service{
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Implementational mehod1");
	}
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Implementational mehtod2");
	}
}
class ImplementationalFactory implements ServiceFactory{
	@Override
	public Service getService() {
		// TODO Auto-generated method stub
		return new Implementational();
	}
	
}
class Implementationa2 implements Service{
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Implementation2 method1");
	}
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Implementation2 method2");
	}
}
class Implementation2Factory implements ServiceFactory{
	@Override
	public Service getService() {
		// TODO Auto-generated method stub
		return new Implementationa2();
	}
}
