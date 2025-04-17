package com.SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

public class PerformMouseActions {

	public static void main(String[] args) throws Exception {
		//WebDriverManager.edgedriver().setup();
		EdgeOptions options=new EdgeOptions();
		options.addArguments("start-maximized");
		WebDriver driver=new EdgeDriver(options);
		Actions actions=new Actions(driver);
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(5000);
		
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		//actions.moveToElement(driver.findElement(By.xpath("//a[.='Admin']"))).click().perform();
//		Select dropdowns=new Select(driver.findElement(By.xpath("//span[.='Organization ']")));
//		dropdowns.selectByVisibleText("Locations");
		//perform context click
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(5000);
		actions.contextClick(driver.findElement(By.xpath("//span[.='right click me']"))).perform();
		actions.click(driver.findElement(By.xpath("//span[.='Edit']"))).perform();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		driver.quit();
		
		



	}

}
