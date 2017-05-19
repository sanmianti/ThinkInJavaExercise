package unit6;

public class Exercise5 {

	public String s1 = "public";
	private String s2 = "private";
	protected String s3 = "protedted";
	String s4 = "default";
	
	public void publicM(){
		System.out.println("public method");
	}
	private void privateM() {
		System.out.println("private method");
	}
	void defaultM(){
		System.out.println("default method");
	}
	protected void protectedM() {
		System.out.println("protected method");
	}
	
	
}
