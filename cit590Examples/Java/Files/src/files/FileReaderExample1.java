package files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample1 {

	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader("jingle.txt");
			try {
				char ch = (char)fileReader.read( );
				System.out.println(ch);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
