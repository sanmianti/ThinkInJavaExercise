package unit10;

public class SubGreenHouseControls extends GreenhouseControls{
	private boolean isSprinklerOn = false;
	
	public class SprinklerOn extends Event{
		public SprinklerOn(long delayTime) {
			// TODO Auto-generated constructor stub
			super(delayTime);
		}
		@Override
		public void action() {
			// TODO Auto-generated method stub
			isSprinklerOn = true;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Turn on Sprinkler";
		}
	}
	
	public class SprinklerOff extends Event{

		public SprinklerOff(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public void action() {
			// TODO Auto-generated method stub
			isSprinklerOn = false;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Turn off Sprinkler";
		}
	}
}
