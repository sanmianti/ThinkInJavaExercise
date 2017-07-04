package unit10;

import javax.print.attribute.standard.RequestingUserName;

public class LocalInnerClass {
	
	private int count = 0;
	Counter getCounter(final String name){
		
		class LocalCounter implements Counter{
			public LocalCounter() {
				// TODO Auto-generated constructor stub
				System.out.println("LocalCounter()");
			}
			@Override
			public int next() {
				// TODO Auto-generated method stub
				System.out.println(name);
				return count++;
				
			}
			
			
		}
		return new LocalCounter();
	}
	Counter getCounter2(final String name){
		return new Counter() {
			{
				System.out.println("Counter()");
			}
			@Override
			public int next() {
				// TODO Auto-generated method stub
				System.out.println(name);
				return count ++;
			}
		};
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInnerClass lic = new LocalInnerClass();
		Counter c1 = lic.getCounter("Local inner"),
				c2 = lic.getCounter2("Anonymous inner");
		for(int i = 0; i < 5; i++){
			System.out.println(c2.next());
		}
		for(int i = 0; i  <  5; i++){
			System.out.println(c1.next());
		}
	}

}
interface Counter{
	int next();
}