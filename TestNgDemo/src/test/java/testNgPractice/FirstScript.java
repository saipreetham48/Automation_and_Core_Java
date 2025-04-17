package testNgPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class FirstScript {
	@Test
	public void googleSearch() {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("saiRddy",Keys.ENTER);
		System.out.println(driver.getTitle());
		driver.quit();
	}
	@Test
	public void facebookSearch() {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("saiRddy",Keys.ENTER);
		driver.quit();
	}
	
	

}
