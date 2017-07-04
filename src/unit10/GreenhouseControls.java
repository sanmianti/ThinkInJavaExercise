package unit10;

public class GreenhouseControls extends Controller{
	
	private boolean light = false;
	public class LightOn extends Event{
		
		public LightOn(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			//Put hardware control code here to physically turn on the light
			light = true;
		}
		public String toString(){
			return "Light is on";
		}
	}
	
	public class LightOff extends Event{
		public LightOff(long delayTime) {
			// TODO Auto-generated constructor stub
			super(delayTime);
		}
		public void action(){
			light = false;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Light is off";
		}
	}
	
	private boolean water = false;
	public class WaterOn extends Event{
		public WaterOn(long delayTime) {
			// TODO Auto-generated constructor stub
			super(delayTime);
		}
		@Override
		public void action() {
			// TODO Auto-generated method stub
			water = true;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Greenhouse water is on";
		}
	}
	
	public class WaterOff extends Event{
		public WaterOff(long delayTime) {
			// TODO Auto-generated constructor stub
			super(delayTime);
		}
		@Override
		public void action() {
			// TODO Auto-generated method stub
			water = false;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Greenhouse water is off";
		}
	}
	
	private String thermostat = "Day";
	public class ThermostatNight extends Event{
		public ThermostatNight(long delayTime) {
			// TODO Auto-generated constructor stub
			super(delayTime);
		}
		@Override
		public void action() {
			// TODO Auto-generated method stub
			thermostat = "Night";
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Thermostat on night setting";
		}
	}
	public class ThermostatDay extends Event{
		public ThermostatDay(long delayTime) {
			// TODO Auto-generated constructor stub
			super(delayTime);
		}
		@Override
		public void action() {
			// TODO Auto-generated method stub
			thermostat = "Day";
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Thermostat onDay setting";
		}
	}
	
	public class Bell extends Event{
		public Bell(long delayTime) {
			// TODO Auto-generated constructor stub
			super(delayTime);
		}
		@Override
		public void action() {
			// TODO Auto-generated method stub
			addEvent(new Bell(delayTime));
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Bing!";
		}
	}
	public class Restart extends Event{
		private Event[] eventList;
		public Restart(long delayTime, Event[] eventList) {
			// TODO Auto-generated constructor stub
			super(delayTime);
			this.eventList = eventList;
			for(Event e : eventList){
				addEvent(e);
			}
		}
		@Override
		public void action() {
			// TODO Auto-generated method stub
			for (Event event : eventList) {
				event.start();
				addEvent(event);
			}
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Restarting system";
		}
	}
	
	public static class Terminate extends Event{
		public Terminate(long delayTime) {
			// TODO Auto-generated constructor stub
			super(delayTime);
		}
		@Override
		public void action() {
			// TODO Auto-generated method stub
			System.exit(0);
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Terminating";
		}
	}
	
	private boolean isFanOn = false;
	public class FanOn extends Event{

		public FanOn(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			isFanOn = true;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Turn on the fan";
		}
	}
	
	public class FanOff extends Event{
		public FanOff(long delayTime) {
			// TODO Auto-generated constructor stub
			super(delayTime);
		}
		@Override
		public void action() {
			// TODO Auto-generated method stub
			isFanOn = false;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Turn off the fan";
		}
	}
	
	
}
