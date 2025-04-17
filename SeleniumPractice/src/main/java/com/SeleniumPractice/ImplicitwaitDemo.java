package com.SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitwaitDemo {
	//default implicit timeout is zero

	public static void main(String[] args) throws Exception {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions actions=new Actions(driver);
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.findElement(By.id("btn1")).click();
		driver.findElement(By.id("txt1")).sendKeys("jumper");
		
		System.out.println(driver.findElement(By.id("txt1")).getAttribute("value"));
		driver.findElement(By.id("btn2")).click();
		driver.findElement(By.id("txt2")).sendKeys("jumperfd");
		
		actions.doubleClick(driver.findElement(By.id("txt1"))).perform();
		System.out.println(driver.findElement(By.id("txt2")).getAttribute("value"));
		Thread.sleep(3000);
		
		driver.quit();
	}

}
