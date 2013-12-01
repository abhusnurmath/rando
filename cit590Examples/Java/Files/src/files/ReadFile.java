package files;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {

	public static void main(String[] args) {
		BufferedReader inputStream = new BufferedReader(new FileReader("xanadu.txt"));
	}
}
