package unit12;

public class CleanupIdiom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Section 1:
		NeedsCleanup nc1 = new NeedsCleanup();
		try{
			//...
		}finally{
			nc1.dispose();
		}
		
		//Section2 
		//If construction cannot fail you can group objects:
		NeedsCleanup nc2 = new NeedsCleanup();
		NeedsCleanup nc3 = new NeedsCleanup();
		try {
			
		} finally {
			// TODO: handle finally clause
			nc3.dispose();
			nc2.dispose();
		}
		
		//Section3
		//If construction can fail you must guard each one
		try {
			NeedsCleanup2 nc4 = new NeedsCleanup2();
			try {
				NeedsCleanup2 nc5 = new NeedsCleanup2();
				try {
					//...
				} finally {
					// TODO: handle finally clause
					nc5.dispose();
				}
			} catch (ConstructionException e) {
				// TODO: handle exception
				System.out.println(e);
			}finally {
				nc4.dispose();
			}
		} catch (ConstructionException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}
class NeedsCleanup{
	private static long counter = 1;
	private final long id = counter ++;
	public void dispose(){
		System.out.println("NeedsCleanup " + id + "disposed");
	}
}
class ConstructionException extends Exception{}
class NeedsCleanup2 extends NeedsCleanup{
	public NeedsCleanup2() throws ConstructionException{
		// TODO Auto-generated constructor stub
	}
}

