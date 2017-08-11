package unit12;

public class StormyInning extends Inning implements Storm{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			StormyInning si = new StormyInning();
			si.atBat();
		} catch (PopFoul e) {
			// TODO: handle exception
			System.out.println("Pop foul");
		}catch (RainedOut e) {
			// TODO: handle exception
			System.out.println("Rained out");
		}catch (BaseballException e) {
			// TODO: handle exception
			System.out.println("Generic baseball exception");
		}
		
		try {
			Inning i = new StormyInning();
		} catch (Strike e) {
			// TODO: handle exception
			System.out.println("Strike");
		}catch (Foul e) {
			// TODO: handle exception
			System.out.println("Foul");
		}catch (RainedOut e) {
			// TODO: handle exception
			System.out.println("Rained out");
		}catch (BaseballException e) {
			// TODO: handle exception
			System.out.println("Generic baseball exception");
		}
	}
	
	public StormyInning() throws RainedOut, BaseballException{
		// TODO Auto-generated constructor stub
	}
	public StormyInning(String s)throws Foul, BaseballException{
		
	}
	
	@Override
	public void rainHard() throws RainedOut {
		// TODO Auto-generated method stub
		
	}
	public void event() {};
	@Override
	public void atBat() throws PopFoul{
		// TODO Auto-generated method stub
		
	}

}
class BaseballException extends Exception{}
class Foul extends BaseballException{}
class Strike extends BaseballException{}
abstract class Inning{
	public Inning() throws BaseballException{
		// TODO Auto-generated constructor stub
	}
	public void event() throws BaseballException{
		//
	}
	public abstract void atBat() throws Strike, Foul;
	public void walk(){
		
	}
}
class StromException extends Exception{}
class RainedOut extends StromException{}
class PopFoul extends Foul{}
interface Storm{
	public void event() throws RainedOut;
	public void rainHard() throws RainedOut;
}