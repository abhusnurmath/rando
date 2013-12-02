package files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample2 {

	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader("jingle.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			try {
				boolean flag = true;
				while (flag) {
					String s = bufferedReader.readLine();
					if (s == null) {
						flag = false;
					} else {
						System.out.println(s);
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
