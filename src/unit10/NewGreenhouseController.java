package unit10;

public class NewGreenhouseController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubGreenHouseControls sghc = new SubGreenHouseControls();
		sghc.addEvent(sghc.new Bell(900));
		Event[] eventList = {
				sghc.new ThermostatNight(0),
				sghc.new LightOn(200),
				sghc.new LightOff(400),
				sghc.new WaterOn(600),
				sghc.new WaterOff(800),
				sghc.new ThermostatDay(1400),
				sghc.new SprinklerOn(1600),
				sghc.new SprinklerOff(1800)
		};
		sghc.addEvent(sghc.new Restart(2000, eventList));
		if (args.length == 0) {
			sghc.addEvent(new SubGreenHouseControls.Terminate(100));
			
		}
		sghc.run();
	}

}
