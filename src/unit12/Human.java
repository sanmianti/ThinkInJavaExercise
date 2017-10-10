package unit12;

public class Human {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			throw new Sneeze();
		}catch(Sneeze e){
			System.out.println("Caught Sneeze");
		}catch (Annoyance e) {
			// TODO: handle exception
			System.out.println("Caught Annoyance");
		}
		try{
			throw new Sneeze();
		}catch(Annoyance e){
			System.out.println("Caught Annoyance");
		}
	}

}
class Annoyance extends Exception{}
class Sneeze extends Annoyance{}