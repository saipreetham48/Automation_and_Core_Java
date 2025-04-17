package com.SeleniumPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling {

	public static void main(String[] args) throws Exception {
		//WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
//		//single window
		String parentWindowHandle=driver.getWindowHandle();
		System.out.println("Parent window handle-"+parentWindowHandle+ driver.getTitle());
		Actions action=new Actions(driver) ;
		//action.moveToElement()
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> windowHandles=driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
			if(!windowHandle.equals(parentWindowHandle)) {
				driver.switchTo().window(windowHandle);
				
				driver.manage().window().maximize();
				driver.findElement(By.id("email")).sendKeys("sai@gmail.com");
				Thread.sleep(3000);
				driver.close();
				Thread.sleep(3000);
			}
			//System.out.println(windowHandle+" "+driver.getTitle());
			
		}
		driver.switchTo().window(parentWindowHandle);
		driver.findElement(By.className("whTextBox")).sendKeys("Zumbo centre");
		Thread.sleep(3000);
		//driver.quit();

		// single tab
//		String parentTabHandle = driver.getWindowHandle();
//		System.out.println("Parent tab handle-" + parentTabHandle + driver.getTitle());
//		driver.findElement(By.id("newTabBtn")).click();
//		Set<String> tabHandles = driver.getWindowHandles();
//		for (String tabHandle : tabHandles) {
//			if (!tabHandle.equals(parentTabHandle)) {
//				driver.switchTo().window(tabHandle);
//				System.out.println(driver.findElement(By.id("output")).getText());
//				driver.findElement(By.id("alertBox")).click();
//				System.out.println(driver.switchTo().alert().getText());
//				Thread.sleep(2000);
//				driver.switchTo().alert().accept();
//				Thread.sleep(2000);
//				System.out.println(driver.findElement(By.id("output")).getText());
//			}
//			// System.out.println(windowHandle+" "+driver.getTitle());
//
//		}
//		driver.switchTo().window(parentTabHandle);
//		driver.findElement(By.className("whTextBox")).sendKeys("Zumbo centre");
//		Thread.sleep(3000);
//		driver.quit();

	}

}
