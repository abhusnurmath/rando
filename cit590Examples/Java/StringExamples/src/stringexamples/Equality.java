package stringexamples;

import java.util.ArrayList;
import java.util.ListIterator;

public class Equality {
	public static void equalityTest(String s1, String s2){
		System.out.println("doing equality");
		if (s1 == s2){
			System.out.println("equal equal returned equality");
		}
		if (s1.equals(s2)){
			System.out.println("the method equals returned equality");
		}
		
	}
	public static void main(String[] args) {
		String s = "abc";
		String t = "abc";
		String u = "a" + new String("bc");
		System.out.println(s==u);
		
	}
	
}
