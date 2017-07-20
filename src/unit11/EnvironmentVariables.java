package unit11;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EnvironmentVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> envMap = System.getenv();
		Set<Entry<String, String>> entries = envMap.entrySet();
		for (Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

}
