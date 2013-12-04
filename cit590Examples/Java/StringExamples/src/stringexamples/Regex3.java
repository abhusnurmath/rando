package stringexamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex3 {
	public static void main(String args[]) {
		String pattern = "\\w|\\s";
		String text = "R2D2, C3P0 and Obi-Wan";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		while (m.find()) {
			System.out.print(text.substring(m.start(), m.end()) + "*");
		}
	}
}
