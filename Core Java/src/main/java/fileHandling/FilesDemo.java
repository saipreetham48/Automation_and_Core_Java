package fileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FilesDemo {

	public static void main(String[] args) throws IOException {
		//File f=new File("D:\\TestFiles\\resume.txt");
		
		
//		System.out.println(f.getAbsolutePath());
		//System.out.println(f.getParent());
		//System.out.println(f.getParentFile());
		//System.out.println(Arrays.toString(f.list()));
//		System.out.println(f.isFile());
//		System.out.println(f.isHidden());
//		System.out.println(f.canWrite());
//		System.out.println(f.setWritable(true));
//		System.out.println(f.canWrite());
		//System.out.println(f.createNewFile());
//		if (f.exists()) {
//			f.delete();
//			f.createNewFile();
//			
//		}
		
		//System.out.println(f.createNewFile());
		//System.out.println(f.delete());
		//System.out.println(f.exists());
		//relative path
		File f=new File("./Resources/resumes");
		//f.mkdir();
		//f.delete();
		//f.mkdirs();

	}

}
