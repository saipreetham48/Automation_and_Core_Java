package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		File file=new File("./sample.txt");
		if (!(file.exists())) {
			file.createNewFile();
			
		}
		/*
		 * it will read char by char and return asciivalue if no chars present then it returns -1
		 */
		FileInputStream fis=new FileInputStream(file);
		InputStreamReader isr=new InputStreamReader(fis);
//		FileReader fr=new FileReader(file);
//		BufferedReader br=new BufferedReader(fr);
		
		BufferedReader br=new BufferedReader(isr);
		String line="";
		while ((line=br.readLine())!=null) {
			System.out.println(line);
		}
		//int asciicode;
//		String text="";
//		while((asciicode=br.read())!= -1) {
//			text+=String.valueOf((char)asciicode);
//			//System.out.print((char)asciicode);
//		}
//		System.out.println(text);
		fis.close();
		

	}

}
