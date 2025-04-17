package com.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("");
		List<WebElement> ls=driver.findElements(By.tagName("a"));
		System.out.println(ls.size());
		for (WebElement link : ls) {
			String linkUrl=link.getAttribute("href");
			
		}
		
	}

}
