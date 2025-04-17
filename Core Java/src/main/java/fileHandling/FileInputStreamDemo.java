package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		File file=new File("./sample.txt");
		if (!(file.exists())) {
			file.createNewFile();
			
		}
		/*
		 * it will read char by char and return asciivalue if no chars present then it returns -1
		 */
		FileInputStream fis=new FileInputStream(file);
		int asciicode;
		String text="";
		while((asciicode=fis.read())!= -1) {
			text+=String.valueOf((char)asciicode);
			//System.out.print((char)asciicode);
		}
		System.out.println();
		System.out.println(text);
		fis.close();
		

	}

}
