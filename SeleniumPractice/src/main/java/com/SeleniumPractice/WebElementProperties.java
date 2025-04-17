package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class WebElementProperties {

	public static void main(String[] args) {
		//WebDriverManager.edgedriver().setup();
		EdgeOptions options=new EdgeOptions();
		options.addArguments("start-maximized");
		WebDriver driver=new EdgeDriver(options);
		driver.navigate().to("https://github.com/login");
		//gettagname
		String tagName=driver.findElement(By.name("commit")).getTagName();
		System.out.println("Tagname:"+tagName);
		//getattribute value
		System.out.println(driver.findElement(By.name("commit")).getAttribute("type"));
		//get attribute value entered in text
		WebElement username=driver.findElement(By.id("login_field"));
		username.sendKeys("sai@gmail.com");
		System.out.println(username.getAttribute("value"));
		
		//gettext
		System.out.println(driver.findElement(By.xpath("//input[@name='password']/preceding-sibling::label")).getText());
		
		//getcssattribute
		System.out.println(driver.findElement(By.name("commit")).getCssValue("text-align"));
		driver.quit();
		

	}

}
