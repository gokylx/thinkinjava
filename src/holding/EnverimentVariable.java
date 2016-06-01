package holding;

import java.util.Map;

public class EnverimentVariable {
	public static void main(String[] args) {
		for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());

		}
		// System.out.println(System.getenv().entrySet());
	}
}
