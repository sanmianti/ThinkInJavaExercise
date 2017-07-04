package unit10;


public abstract class Event {
	private long eventTime;
	protected final long delayTime;
	public Event(long delayTime) {
		// TODO Auto-generated constructor stub
		this.delayTime = delayTime;
		start();
	}
	public void start() {
		// TODO Auto-generated method stub
		eventTime = System.nanoTime() + delayTime;
	}
	public boolean ready(){
		return System.nanoTime() >= eventTime;
	}
	public abstract void action();
}
