package files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LineReader {
	BufferedReader bufferedReader;

	LineReader(String fileName) {
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(fileName);
		} catch (FileNotFoundException e) {
			System.err.println("LineReader cannot find input file " + fileName);
			e.printStackTrace();
		}
		bufferedReader = new BufferedReader(fileReader);
	}

	/***
	 * read a single line
	 * @return one line of the current file
	 */
	String readLine() {
		try {
			return bufferedReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	void close() {
	    try {
	        bufferedReader.close( );
	    }
	    catch(IOException e) { }
	}
}
