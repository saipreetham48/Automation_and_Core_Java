package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SimpleCssSelectors {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.hyrtutorials.com/p/css-selectors-practice.html");
		System.out.println(driver.findElement(By.cssSelector("button")).getDomAttribute("id"));//element selector:"tagname"
		driver.findElement(By.cssSelector("#lastName")).sendKeys("SAi");//by id:"#id attribute"
		driver.findElement(By.cssSelector(".gender")).sendKeys("male");//by name:".classname attribute"
		System.out.println(driver.findElement(By.cssSelector("*")));//universal selector:"*"
	}

}
