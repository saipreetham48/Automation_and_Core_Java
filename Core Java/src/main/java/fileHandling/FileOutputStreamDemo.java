package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		File file=new File("./sample.txt");
		if(file.exists())
		{
			file.delete();
			file.createNewFile();
		}
		
		FileOutputStream fos=new FileOutputStream(file);
		String s="Hello";
		for(char ch : s.toCharArray()) {
			fos.write((int)ch);
		}
//		fos.write(87);
//		fos.write(47);
//		fos.write(89);
//		fos.write(87);
//		fos.write(74);
		fos.close();
		
	}

}
