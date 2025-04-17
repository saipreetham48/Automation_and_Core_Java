package dependencyTests;

import org.testng.annotations.Test;

public class DependencyOnGroups {
	@Test(groups="smoke")
	public void test1() {
		System.out.println("smoke");
	}
	
	@Test(groups="smoke")
	public void test2() {
		System.out.println("smoke");
	}
	@Test(groups="smoke")
	public void test3() {
		System.out.println("smoke");
	}
	@Test(groups="sanity")
	public void test4() {
		System.out.println("sanity");
	}
	@Test(groups="regression")
	public void test5() {
		System.out.println("regression");
	}
	@Test(groups="regression")
	public void test6() {
		System.out.println("regression");
	}
	
//	@Test(dependsOnGroups = "smoke")
//	public void main() {
//		System.out.println("main");
//	}

}
