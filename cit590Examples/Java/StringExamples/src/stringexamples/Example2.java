package stringexamples;

public class Example2 {
	public static void main(String[] args) {
		String s1 = "random string! and even more randomness";
		System.out.println(s1.indexOf("and"));
		System.out.println(s1.indexOf("and", 3));
		
		String s2 = "Strings, which are widely used in Java programming, are a sequence of characters";
		boolean equality;
		equality = s2.equals("strings, which Are widely used in Java programming, are a sequence of characters");
		String ending = (equality==true)?"equal":"not equal";
		System.out.println("the strings are " + ending);
	}
	
}
