package unit10;

public class Factories {

	public static void serviceConsumer(ServiceFactory fact){
		Service service = fact.getService();
		service.method1();
		service.method2();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		serviceConsumer(Implementationl.factory);
		serviceConsumer(Implementation2.factory);
	}

}
interface Service{
	void method1();
	void method2();
}
interface ServiceFactory{
	Service getService();
}
class Implementationl implements Service{
	private Implementationl(){}
	@Override
	public void method1() {
		// TODO Auto-generated method stub
	
		System.out.println("Implementational method1");
	}
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Implementational method2");
	}
	public static ServiceFactory factory = new ServiceFactory() {
		
		@Override
		public Service getService() {
			// TODO Auto-generated method stub
			return new Implementationl();
		}
	};
}
class Implementation2 implements Service{
	private Implementation2(){}
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Implementationa2 method1");
	}
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Implementationa2 method2");
	}
	public static ServiceFactory factory = new ServiceFactory() {
		
		@Override
		public Service getService() {
			// TODO Auto-generated method stub
			return new Implementation2();
		}
	};
}