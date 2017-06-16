package test2;

public class ReferenceCounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shared shared = new Shared();
		Composing[] composings = {
				new Composing(shared),
				new Composing(shared),
				new Composing(shared),
				new Composing(shared),
				new Composing(shared)
		};
		for (Composing composing : composings) {
			composing.dispose();
		}

		System.gc();
		System.runFinalization();
		new Composing(new Shared());
		System.gc();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("ReferenceCounting finalize()");
		super.finalize();
	}
}

class Shared{
	private int refcount = 0;
	private static long counter = 0;
	private final long id = counter++;
	public Shared() {
		// TODO Auto-generated constructor stub
		System.out.println("Creating" + this);
	}
	public void addRef(){
		refcount ++;
	}
	protected void  dispose() {
		if (--refcount == 0) {
			System.out.println("Disposing " + this);
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Shared " + id;
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		if (refcount != 0) {
			System.out.println("Error : object is not properly cleaned-up");
		}
		System.out.println("Shared finalize()");
		super.finalize();
	}
}
class Composing{
	private Shared shared;
	private static long counter = 0;
	private final long id = counter ++;
	public Composing(Shared shared) {
		// TODO Auto-generated constructor stub
		System.out.println("Creating " + this);
		this.shared = shared;
		this.shared.addRef();
		}
	
	protected void dispose() {
		System.out.println("disposing " + this);
		shared.dispose();
	}
	public String toString() {
		return ".Composing " + id;
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Composing finalize()");
		super.finalize();
	}
}