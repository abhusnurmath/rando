package files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileViaMethod {
	
	public void readFile() throws FileNotFoundException{
		BufferedReader inputStream = new BufferedReader(new FileReader("xanadu.txt"));
	}

	public static void main(String[] args) {
		try {
			new ReadFileViaMethod().readFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
