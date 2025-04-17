package testNgPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeTestAutomation {
	WebDriver driver;
	@BeforeTest
	public void initializeBrowser() {
		driver=new EdgeDriver();
		driver.manage().window().maximize();
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	@Test
	public void launchApp() {
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	@Test
	public void enterLoginDetails() {
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();;
	}
	@Test
	public void verifyLogin() {
		WebElement el= driver.findElement(By.xpath("//strong[contains(.,'Congratulations')]"));
		System.out.println(el.isDisplayed());
		System.out.println(el.getText());
	}
	@Test
	public void logout() {
		driver.findElement(By.xpath("//a[.='Log out']")).click();
	}
	@Test
	public void verifyLogout() {
		Assert.assertEquals(driver.getTitle(), "Test Login | Practice Test Automation","Title mismatched");
		System.out.println("I am on login page now");
	}

}
