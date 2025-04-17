package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * Identify the webpage elements with the help of locators 1.Id 2.name
		 * 3.className 4.linkText 5.partialLinkText 6.tagName 7.xpath 8.css selector
		 * 
		 */
		//WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://github.com/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// using id locator
		highlight(driver,driver.findElement(By.id("login_field")));
		Thread.sleep(3000);
		// using name locator
		highlight(driver,driver.findElement(By.name("password")));
		Thread.sleep(3000);
		// using classname locator
		highlight(driver,driver.findElement(By.className("header-logo")));
		Thread.sleep(3000);
		// using linktext locator
		highlight(driver,driver.findElement(By.linkText("Create an account")));
		Thread.sleep(3000);
		// using partiallinktext locator
		highlight(driver,driver.findElement(By.partialLinkText("password?")));
		Thread.sleep(3000);
		// using tagname locator
		highlight(driver,driver.findElement(By.tagName("h1")));
		Thread.sleep(3000);
		// using xpath locator
		highlight(driver,driver.findElement(By.xpath("//label[contains(text(),'Username')]")));
		Thread.sleep(3000);
		// using css selector locator
		highlight(driver,driver.findElement(By.cssSelector("input[type=submit]")));
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.quit();

	}
	public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
	}

}
