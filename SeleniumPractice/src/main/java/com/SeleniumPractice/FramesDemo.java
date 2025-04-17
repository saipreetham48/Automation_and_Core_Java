package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

public class FramesDemo {


	public static void main(String[] args) throws Exception {
		EdgeOptions options=new EdgeOptions();
		options.addArguments("start-maximized");
		WebDriver driver=new EdgeDriver(options);
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("sai reddy");
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		Select courseDD=new Select(driver.findElement(By.id("course")));
		Thread.sleep(3000);
		courseDD.selectByVisibleText("Python");
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.id("name")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("sai preetham");
		Thread.sleep(3000);
		//switching to frame2
		driver.switchTo().frame(driver.findElement(By.id("frm2")));
		Thread.sleep(3000);
		driver.findElement(By.id("hindichbx")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("lastName")).sendKeys("subramaniam");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("ding ding");
		Thread.sleep(3000);
		//switch to frame3
		driver.switchTo().frame(driver.findElement(By.id("frm3")));
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		Select cdd=new Select(driver.findElement(By.id("course")));
		cdd.selectByVisibleText("Java");
		driver.switchTo().parentFrame();
		
		Thread.sleep(10000);
		driver.findElement(By.id("name")).sendKeys("Zumping zapong");
		Thread.sleep(10000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("cake mukka");
		Thread.sleep(3000);
		
		
		driver.quit();

	}

}
