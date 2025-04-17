package testNgPractice;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class AssertDemo {
	@Test
	public void testGoogle() {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/");
		assertEquals(driver.getTitle(), "H Y R Tutorials - H Y R Tutorials","Title mismatched");
		driver.quit();
		
	}

}
