package unit9;

import java.security.spec.ECField;

import unit9.A.E;

public class NestingInterfaces {

	public class BImp implements A.B{

		@Override
		public void f() {
			// TODO Auto-generated method stub
			
		}
		
	}
	class CImp implements A.C{

		@Override
		public void f() {
			// TODO Auto-generated method stub
		}
		
	}
	class EImp implements E{

		@Override
		public void g() {
			// TODO Auto-generated method stub
			
		}
		
	}
	class EGImp implements E.G{

		@Override
		public void f() {
			// TODO Auto-generated method stub
			
		}
		
	}
	class EImp2 implements E{

		@Override
		public void g() {
			// TODO Auto-generated method stub
			
		}
		
		class EG implements E.G{

			@Override
			public void f() {
				// TODO Auto-generated method stub
				
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
//		A.DImp2 di2 = a.getD();
		A a2 = new A();
		a2.receiveD(a.getD());
	}

}

class A{
	interface B{
		void f();
	}
	public class BImp implements B{
		@Override
		public void f() {
			// TODO Auto-generated method stub
			
		}
	}
	interface C{
		void f();
	}
	class CImp implements C{
		@Override
		public void f() {
			// TODO Auto-generated method stub
			
		}
	}
	private class CImp2 implements C{
		@Override
		public void f() {
			// TODO Auto-generated method stub
			
		}
	}
	private interface D{
		void f();
	}
	private class DImp implements D{
		@Override
		public void f() {
			// TODO Auto-generated method stub
			
		}
	}
	public class DImp2 implements D{
		@Override
		public void f() {
			// TODO Auto-generated method stub
			
		}
	}
	
	public D getD(){
		return new DImp2();
	}
	private D dRef;
	public void receiveD(D d){
		dRef = d;
		dRef.f();
	}
	
	interface E{
		interface G{
			void f();
		}
		public interface H{
			void f();
		}
		void g();
//		private interface I{}
	}

}