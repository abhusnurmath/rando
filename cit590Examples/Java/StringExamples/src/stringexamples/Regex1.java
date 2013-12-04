package stringexamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
	
	public static void main(String[] args) {
		String s = "Now is the time";
		Pattern p = Pattern.compile("[a-z]+");
		Matcher m = p.matcher(s);
		
		//methods on the matcher
		//m.matches(); - the whole thing
		//m.lookingAt(); - the start
		m.find(); // keep trying to find the pattern
		
		System.out.println(s.substring(m.start(), m.end()));
	}
}
