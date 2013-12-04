package stringexamples;

public class Example3 {

	public static void main(String[] args) {
		String r = "what is and what should never be";
		int lastpos = r.lastIndexOf("what");
		System.out.println(lastpos);
		//begin at the first argument and go until the second argument - 1
		String lastportion = r.substring(lastpos, r.length());
		System.out.println(lastportion);
	}
}
