package files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		try {
			BufferedReader inputStream = new BufferedReader(new FileReader("xanadu.txt"));
			String firstLine = inputStream.readLine();
			System.out.println(firstLine);
		} catch (FileNotFoundException e) {
		}
		catch (IOException e){
		}
	}
}
