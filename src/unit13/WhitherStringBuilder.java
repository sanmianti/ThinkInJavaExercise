package unit13;

public class WhitherStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public String inplicit(String[] fields){
		String result = "";
		for(int i = 0; i < fields.length; i++){
			result += fields[i];
		}
		return result;
	}
	public String explicit(String[] fields){
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < fields.length; i++){
			result.append(fields[i]);
		}
		return result.toString();
	}
}
