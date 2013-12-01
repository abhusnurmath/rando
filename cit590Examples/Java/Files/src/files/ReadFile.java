package files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFile {

	public static void main(String[] args) {
		try {
			BufferedReader inputStream = new BufferedReader(new FileReader("xanadu.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
