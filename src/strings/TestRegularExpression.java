// Allows you to easily try out regular expressions.

package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpression {
	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("Usage:\n java TestRegularExpression args...");
			System.exit(0);
		}
		System.out.println("Input \"" + args[0] + "\"");
		for (String string : args) {
			Pattern pattern = Pattern.compile(string);
			Matcher matcher = pattern.matcher(args[0]);
			while (matcher.find()) {
				System.out.println(matcher.group() + matcher.start() + matcher.end());
			}
		}
	}
}
