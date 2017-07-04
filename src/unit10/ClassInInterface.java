package unit10;

public interface ClassInInterface {
	void howdy();
	class Test implements ClassInInterface{
		@Override
		public void howdy() {
			// TODO Auto-generated method stub
		
			System.out.println("Howdy!");
		}
		public static void main(String[] args){
			System.out.println("InnerClass main()");
			new Test().howdy();
		}
		
	}
}

