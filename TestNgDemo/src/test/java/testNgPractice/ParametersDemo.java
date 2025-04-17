package testNgPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {
	WebDriver driver;
	@Parameters("browserName")
	@BeforeTest
	public void initializeBrowser(@Optional("chrome")String bName) {
		switch (bName.toLowerCase()) {
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;

		default:
			System.out.println("Browser is invalid");
			break;
		}
		driver.manage().window().maximize();
	}
	
	@Parameters("waitTime")
	@AfterTest
	public void tearDown(long waitTime) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waitTime));
		driver.quit();
	}
	
	@Parameters("url")
	@Test
	public void launchApp(String url) {
		driver.get(url);
	}
	
	@Parameters({"username","password"})
	@Test
	public void enterLoginDetails(String userName,String passWord) {
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(passWord);
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
