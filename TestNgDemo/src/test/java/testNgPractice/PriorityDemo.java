package testNgPractice;

import org.testng.annotations.Test;

public class PriorityDemo {
	@Test
	public void signUp() {
		System.out.println("Sign up");
	}
	@Test(priority=1)
	public void login() {
		System.out.println("login");
	}
	@Test(priority=2)
	public void searchFlight() {
		System.out.println("searchFlight");
	}
	@Test(priority=3)
	public void bookTicket() {
		System.out.println("bookTicket");
	}
	@Test(priority=4)
	public void saveYourTicket() {
		System.out.println("saveYourTicket");
	}
	@Test(priority=5)
	public void logout() {
		System.out.println("logout ");
	}

}
