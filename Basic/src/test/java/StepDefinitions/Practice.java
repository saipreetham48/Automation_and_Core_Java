package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Practice {

	public static void main(String[] args) throws Exception {
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.id("email")).sendKeys("sda");
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys(Keys.F5);
		System.out.println(driver.manage().getCookies());
		driver.manage().deleteAllCookies();
		System.out.println(driver.manage().getCookies());
		driver.quit();
	}

}
