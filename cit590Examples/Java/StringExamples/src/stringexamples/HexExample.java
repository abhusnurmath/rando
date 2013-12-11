package stringexamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexExample {
	
	public static void main(String[] args) {
		String s = "0xAf";
		//we want to write a regular expression that would match hexadecimal numbers.
		//hex numbers are numbers written in base 16. 
		//They usually (but not always) begin with 0x 
		//The digits 0 through 9 - nothing special, just write it the same way
		//The numbers 10 through 15 are represented by letters a through f (case does not matter)
		
		Pattern p = Pattern.compile("(0x)?[0-9A-Fa-f]+");
		
		Matcher m = p.matcher(s);
		System.out.println(m.matches());
		
		Pattern p1 =  Pattern.compile("(0x)?[0-9A-Fa-f]*");
		System.out.println(m.matches());
		//so what is wrong with putting the * at the end anyway?
		//think about the string "0x". Is that valid hex?
	}
}
