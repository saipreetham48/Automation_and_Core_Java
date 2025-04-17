package exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.FileSystemNotFoundException;
import java.util.Arrays;

public class ExceptionHandlingDemo {
	/*
	 * Exception:an event that occurs distruption during the execution of a program
	 * Exception handling:if an user wants to handle the exception is called exception handling
	 * why exception handling?
	 * A:if any problem occurs during execution,java will stop the code immediatialy,so if we handled the excecption then eventhough problem occurs the code will run.
	 * 
	 *to handle the exceptions we use try,catch,finally blocks.
	 */

	public static void main(String[] args) throws Exception {
		System.out.println("program execution starts");
		int a=5;
		int b=0;
		//File f=new File("./Resources");
		
		try {
			int res=a/b;
			
		} catch (Exception e) {
			throw e;
		}
		
		
//		try {
////			int res=a/b;
////			System.out.println(res);
//			FileInputStream fis=new FileInputStream(f);
//		
//			
//		}
//		catch (FileNotFoundException ae) {
//			//System.out.println(Arrays.toString(ae.getStackTrace()));
//			//ae.printStackTrace();
//			System.out.println("In catch block");
//		}
//		finally {
//			System.out.println("In finally block");
//		}
		
		
		
	
//		System.out.println("Output is:"+res);
//		System.out.println("program execution ends");
	}
//	public static void method2() {
//		method1();
//	}
//	public static void method1() {
//		int a=5;
//		int b=0;
//		int c=a/b;
//	}

}
