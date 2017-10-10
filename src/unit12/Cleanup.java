package unit12;

import java.io.File;

public class Cleanup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		try{
			InputFile in = new InputFile("./src/unit12/Cleanup.java");
			try{
				String s;
				int i = 1;
				while((s = in.getLine()) != null){
					
				}
			}catch(Exception e){
				System.out.println("Caught Exception in main");
				e.printStackTrace();
			}finally {
				in.dispose();
			}
		}catch(Exception e){
			System.out.println("InputFile construction failed");
		}
	}

}
