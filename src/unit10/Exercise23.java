package unit10;

public class Exercise23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A_ a = new A_();
		B_ b = new B_(10);
		b.addU(a.getU());
		b.addU(a.getU());
		b.addU(a.getU());
		b.addU(a.getU());
		b.traversal();
		System.out.println("---------------");
		b.setNull(0);  
		b.setNull(3);
		b.traversal();
	}

}
interface U{
	void f();
	void g();
	void h();
}
class A_{
	void x(){
		
	}
	U getU(){
		return new U() {
			
			@Override
			public void h() {
				// TODO Auto-generated method stub
				System.out.println("h()");
			}
			
			@Override
			public void g() {
				// TODO Auto-generated method stub
				System.out.println("g()");
			}
			
			@Override
			public void f() {
				// TODO Auto-generated method stub
				System.out.println("f()");
			}
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "U";
			}
		};
	}
}
class B_{
	U[] uArray ;
	int i = 0;
	public B_(int i){
		uArray = new U[i];
	}
	boolean addU(U u){
		if (i < uArray.length) {
			uArray[i] = u;
			i++;
			return true;
		}else {
			return false;
		}
	}
	boolean setNull(int i){
		if (i < 0 || i >= uArray.length) {
			return false;
		}else {
			uArray[i] = null;
			return true;
		}
		
	}
	void traversal(){
		for (U u : uArray) {
			if (u != null) {
				u.f();
				u.g();
				u.h();
			}
			
		}
	}
}