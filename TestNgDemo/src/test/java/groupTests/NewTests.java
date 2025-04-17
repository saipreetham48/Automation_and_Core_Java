package groupTests;

import org.testng.annotations.Test;

public class NewTests {
	@Test (groups= {"smoke","sanity","windows.smoke"})
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(groups= {"regression","sanity", "windows.sanity", "ios.sanity"})
	public void test2() {
		System.out.println("test2");
	}
	
	@Test
	public void test3() {
		System.out.println("test3");
	}

}
