package com.SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class TestBrowserMaximization {

	public static void main(String[] args) throws Exception {
		//First way
		//for browser related configurations,use manage method
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver=new EdgeDriver();//opening webdriver
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		driver.get("https://www.google.com/");
//		Thread.sleep(3000);
//		driver.quit();
		
		/*
		 * Second way :Maximize the window during the browser opening
		 * before opening the browser,if we want to set configurations then use
		 * 1.desired capabiliteies or
		 * 2.browser options class[eg:chromeOptions,edgeOptions]
		 * Before selenium 4.0,for edge browser there is a issue so add 
		 * microsoftedge-tools-java dependency
		 */
		//WebDriverManager.edgedriver().setup();
		EdgeOptions options=new EdgeOptions();
		options.addArguments("start-maximized");
		WebDriver driver=new EdgeDriver(options);
		driver.get("https://www.google.com/");
		driver.quit();
		

	}

}
