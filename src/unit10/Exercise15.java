package unit10;

public class Exercise15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise15 exe15 = Test15.getExe15();
	}


	public Exercise15(int i) {
		// TODO Auto-generated constructor stub
	}
	
}

class Test15{
	public static Exercise15 getExe15(){
		return new Exercise15(10){
			
		};
	}
}