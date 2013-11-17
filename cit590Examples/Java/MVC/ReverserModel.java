package mvc;

public class ReverserModel {

	public ReverserModel() {
	}

	public String reverse(String s) {
		StringBuilder builder = new StringBuilder(s);
		builder.reverse();
		return builder.toString();
	}
}
