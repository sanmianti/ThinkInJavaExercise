package unit10;

public class Sequence {

	private Object[] items;
	private int next = 0;
	public Sequence(int size) {
		// TODO Auto-generated constructor stub
		items = new Object[size];
	}
	public void add(Object x){
		if (next < items.length) {
			items[next++] = x;
		}else {
			throw new IndexOutOfBoundsException();
		}
	}
	
	private class SequenceSelector implements Selector{
		private int i = 0;
		@Override
		public boolean end() {
			// TODO Auto-generated method stub
			return i == items.length;
		}
		@Override
		public Object current() {
			// TODO Auto-generated method stub
			return items[i];
		}
		@Override
		public void next() {
			// TODO Auto-generated method stub
			if (i < items.length) {
				i++;
			}
		}
		Sequence outer(){
			return new Sequence(10);
		}
	}
	private class ReverseSelector implements Selector{
		
		private int i = items.length ;
		
		@Override
		public boolean end() {
			// TODO Auto-generated method stub
			return i == 0;
		}

		@Override
		public Object current() {
			// TODO Auto-generated method stub
			return items[i-1];
		}

		@Override
		public void next() {
			// TODO Auto-generated method stub
			if (i > 0) {
				i--;
			}
			
		}
		
	}
	public Selector selector(){
		return new SequenceSelector();
	}
	public Selector reverseSelector(){
		return new ReverseSelector();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//初始化一个长度为10的数组
		Sequence sequence = new Sequence(10);
		//数组赋值
		for(int i = 0; i < 10; i++){
			sequence.add(Integer.toString(i));
		}
		//获取迭代器
		Selector selector = sequence.selector();
		while (!selector.end()) {
			System.out.println(selector.current() + " ");
			selector.next();
			
		}
		Selector reverseSelector = sequence.reverseSelector();
		while (! reverseSelector.end()) {
			System.out.println(reverseSelector.current());
			reverseSelector.next();
			
			
		}
		
		Sequence sequence2 = sequence.new SequenceSelector().outer();
	}

}
interface Selector{
	boolean end();
	Object current();
	void next();
}