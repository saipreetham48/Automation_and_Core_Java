package testNgPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenHRM {
WebDriver driver;
	
	@BeforeTest
	public void InitialiseBrowser() {
		driver = new EdgeDriver();
		
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void TearDown() {
		driver.quit();
	}
	
	@Test
	public void LaunchApp() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test
	public void EnterLoginDetails() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		usernameField.sendKeys("Admin");
		//driver.findElement(By.name("username")).sendKeys("Admin");
		WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		passwordField.sendKeys("admin123");
		//driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button")).click();
	}
	
//	@Test
//	public void NavigateToMyInfo() {
//		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
//	}
//	
//	@Test
//	public void VerifyMyInfo() {
//		System.out.println(driver.findElement(By.id("employee-details")).isDisplayed());
//	}
//	
//	@Test
//	public void VerifyLogin() {
//		WebElement element = driver.findElement(By.id("welcome"));
//		System.out.println(element.isDisplayed());
//		System.out.println(element.getText());
//	}
}
