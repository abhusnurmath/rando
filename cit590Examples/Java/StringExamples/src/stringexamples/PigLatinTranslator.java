package stringexamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PigLatinTranslator {
	Pattern wordPlusStuff = Pattern.compile("([a-zA-Z]+)([^a-zA-Z]*)");
	Pattern consonantsPlusRest = Pattern.compile("([^aeiouAEIOU]+)([a-zA-Z]*)");

	public String translate(String text) {
		Matcher m = wordPlusStuff.matcher(text);
		String translatedText = "";
		while (m.find()) {
			translatedText += translateWord(m.group(1)) + m.group(2);
		}
		return translatedText;
	}

	private String translateWord(String word) {
		Matcher m = consonantsPlusRest.matcher(word);
		if (m.matches()) {
			return m.group(2) + m.group(1) + "ay";}
		else return word + "hay";
	}
	
	public static void main(String[] args) {
		String s = "regular expression";
		String latin = new PigLatinTranslator().translate(s);
		System.out.println(latin);
	}
}
