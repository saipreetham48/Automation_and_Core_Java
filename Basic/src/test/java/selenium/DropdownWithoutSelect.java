package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdownWithoutSelect {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement searchBox=driver.findElement(By.className("gLFyf"));
		searchBox.sendKeys("selenium tutorial");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		List<WebElement> suggestions=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='lnnVSe']/div[contains(normalize-space(.),'selenium tutorial python')]")));
		suggestions.get(2).click();
		//		if (suggestions.size()>=3) {
//			suggestions.get(2).click();
//		}
//		else
//			System.out.println("not enough suggestions");
		driver.quit();
	}
	

}
