package unit10;

import java.util.ArrayList;
import java.util.List;

public class Controller {
	private List<Event> eventList = new ArrayList<Event>();
	public void addEvent(Event c){
		eventList.add(c);
	}
	public void run(){
		while(eventList.size() > 0){
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(Event event : new ArrayList<>(eventList)){
				if (event.ready()) {
					System.out.println(event);
					event.action();
					eventList.remove(event);
					
				}
			}
		}
	}
}
