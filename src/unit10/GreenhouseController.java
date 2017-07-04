package unit10;

import test2.InterfaceTest;

public class GreenhouseController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreenhouseControls gc = new GreenhouseControls();
//		gc.addEvent(gc.new Bell(900));
		Event[] events = {
				gc.new ThermostatNight(0),
				gc.new LightOn(200),
				gc.new LightOff(400),
				gc.new WaterOn(600),
				gc.new WaterOff(800),
				gc.new ThermostatDay(1400)
		};
		gc.addEvent(gc.new Restart(2000, events));
		gc.addEvent(gc.new FanOn(500));
		gc.addEvent(gc.new FanOff(500));
		if (args.length == 0) {
			gc.addEvent(new GreenhouseControls.Terminate(5500));
		}
		gc.run();
	}

}
