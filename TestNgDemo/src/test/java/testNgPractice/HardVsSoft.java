package testNgPractice;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoft {
	@Test
	public void facebookTest() {
		WebDriver driver = new EdgeDriver();
		SoftAssert sa=new SoftAssert();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		// title assertion
		sa.assertEquals(driver.getTitle(), "Facebook – log in or sign up", "Title mismatched");

		// url assertion
		sa.assertNotEquals(driver.getCurrentUrl(), "Url mismatched");

		// text assertion
		driver.findElement(By.name("email")).sendKeys("hyrtutorialj", Keys.ENTER);
		sa.assertEquals(driver.findElement(By.name("email")).getDomAttribute("value"), "", "text mismatched");

		// message assertion

		sa.assertEquals(driver.findElement(By.xpath("(//div[@id='email_container'])/div[last()]")).getText(),
				"The email address or mobile number you entered isn't connected to an account. Find your account and log in.",
				"message mismatched");

		driver.quit();
		sa.assertAll();
	}

}
