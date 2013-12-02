package files;

public class ReadFileUsingLineReader {
	public static void main(String[] args) {
		LineReader lr = new LineReader("penn.txt");
		String s = lr.readLine();
		System.out.println(s);
		lr.close();
	}
}
