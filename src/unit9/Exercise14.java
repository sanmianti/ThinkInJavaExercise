package unit9;

public class Exercise14 {

	static void f(InterfaceA a){}
	static void g(InterfaceB b){}
	static void h(InterfaceC c){}
	static void m(CombinInterface d){}
	static void n(ClassA a){};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClasB b = new ClasB();
		f(b);
		g(b);
		h(b);
		m(b);
		n(b);
		ClassC c = new ClassC();
		f(c);
		g(c);
		h(c);
		m(c);
		
	}

}
interface InterfaceA{
	void a();
	void b();
}
interface InterfaceB{
	void c();
	void d();
}
interface InterfaceC{
	void e();
	void f();
}
interface CombinInterface extends InterfaceA, InterfaceB, InterfaceC{
	void g();
}
class ClassA{
	
}
class ClasB extends ClassA implements CombinInterface{

	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void c() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void d() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void e() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void f() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void g() {
		// TODO Auto-generated method stub
		
	}
	
}
abstract class AbstractClassA{
	abstract void s();
}
class ClassC extends AbstractClassA implements InterfaceA, InterfaceB, InterfaceC, CombinInterface{

	@Override
	void s() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void g() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void e() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void f() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void c() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void d() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		
	}
	
}