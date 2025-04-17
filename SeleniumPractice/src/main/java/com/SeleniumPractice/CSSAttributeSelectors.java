package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CSSAttributeSelectors {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
		System.out.println(driver.findElements(By.cssSelector("input[placeholder]")).size());//using attribute name
		System.out.println(driver.findElements(By.cssSelector("input[placeholder='Country']")).size());//using attribute name='value'
		System.out.println(driver.findElements(By.cssSelector("input[placeholder~='question']")).size());//using attributevalue-partialtext-wholeword
		System.out.println(driver.findElements(By.cssSelector("input[placeholder*='que']")).size());//attributevalue-partialtext-text
		System.out.println(driver.findElements(By.cssSelector("p[class|='my']")).size());//attribute value-startswith-wholeword
		System.out.println(driver.findElements(By.cssSelector("p[class^='my']")).size());//attributevalue-startswith-text
		System.out.println(driver.findElements(By.cssSelector("p[class$='test']")).size());//attributevalue-endswith-text
		driver.quit();
		
		
		
	}

}
