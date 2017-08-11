package unit12;

public class OnOffSwitch {
	private static Switch sw = new Switch();
	
	public static void f() throws OnOffException1, OnOffException2{
		throw new RuntimeException();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
				sw.on();
				f();
				
			} catch (OnOffException1 e) {
				// TODO Auto-generated catch block
				System.out.println("OnOffException1");
			} catch (OnOffException2 e) {
				// TODO Auto-generated catch block
				System.out.println("OnOffException2");
			}
			finally {
				sw.off();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Outer catch block");
		}
	}

}
