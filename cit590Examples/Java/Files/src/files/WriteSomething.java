package files;

public class WriteSomething {

	public static void main(String[] args) {
		LineWriter lw = new LineWriter("arbit.txt");
		lw.writeLine("what is this life if full of care");
		lw.close();
	}
}
