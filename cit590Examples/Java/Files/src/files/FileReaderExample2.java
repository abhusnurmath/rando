package files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample2 {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		FileReader fileReader = new FileReader("penn.txt");
		try {
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			try {
				boolean flag = true;
				while (flag) {
					String s = bufferedReader.readLine();
					//if end of file, bufferedReader returns null
					if (s == null) {
						flag = false;
					} else {
						System.out.println(s);
					}
				}
			} catch (IOException e) {
				System.out.println("please put proper text in the file");
				e.printStackTrace();
			}
		}
		finally{
			//whatever happens we want to close the stream
			fileReader.close();
		}

	}
}
