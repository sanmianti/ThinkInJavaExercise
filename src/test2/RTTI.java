package test2;

public class RTTI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Useful[] x = {new Useful(), new MoreUseful()};
		x[0].f();
		x[1].g();
		((MoreUseful)x[1]).u();
	}

}
class Useful{
	public void f(){
		
	}
	public void g(){
		
	}
}
class MoreUseful extends Useful{
	@Override
	public void f() {
		// TODO Auto-generated method stub
	}
	@Override
	public void g() {
		// TODO Auto-generated method stub
	}
	public void u(){}
	public void v(){}
	public void w(){}
}