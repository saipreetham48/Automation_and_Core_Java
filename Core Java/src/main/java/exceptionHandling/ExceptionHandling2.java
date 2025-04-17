package exceptionHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ExceptionHandling2 {

	public static void main(String[] args) throws Exception  {
//		File file=new File("./sample.txt");
//		if(file.exists())
//		{
//			file.delete();
//			try(FileOutputStream fos=new FileOutputStream(file);) {
//				file.createNewFile();
//				
//				String s="Hello";
//				for(char ch : s.toCharArray()) {
//					fos.write((int)ch);
//				}
//				
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		
		
		//}
		try {
			System.out.println("in try block");
			int a=2/0;
			//System.exit(0);
		} catch (ArithmeticException e) {
			//System.out.println("in catch blocxk");
			throw new CustomException("custom exception");
			//throw new ArithmeticException("dont use 0 in denominator");
		}
		finally {
			System.out.println("in finally block");
		}
		
		
//	try {
//		int arr[]= {1,2};
//		System.out.println(arr[1]/0);
//	}
//	catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
//		e.printStackTrace();
//	}
		
//	} catch (ArrayIndexOutOfBoundsException e) {
//		e.printStackTrace();
//	}
//	catch (ArithmeticException e1) {
//e1.printStackTrace();
//	}
		
	}

}
