package files;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class LineWriter {
	PrintWriter printWriter;

	LineWriter(String fileName) {
		try {
			printWriter = new PrintWriter(new FileOutputStream(fileName), true);
		} 
		catch (Exception e) {
			System.err.println("LineWriter can’t " + "use output file: "
					+ fileName);
		}
	}

	void writeLine(String line) {
		printWriter.println(line);
	}

	void close() {
		printWriter.flush();
		try{
			printWriter.close();
		}
		catch(Exception e){
			System.out.println("something went wrong when closing the file");
		}
	}
}
