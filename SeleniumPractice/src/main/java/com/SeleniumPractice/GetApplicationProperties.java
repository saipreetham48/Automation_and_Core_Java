package com.SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class GetApplicationProperties {


	public void fbegb(){

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * application properties include:
		 * page title,current page url,html page source
		 */
		//WebDriverManager.edgedriver().setup();
		EdgeOptions options=new EdgeOptions();
		options.addArguments("start-maximized");
		WebDriver driver=new EdgeDriver(options);
		driver.get("http://seleniumhq.com/");
		//get page title
		
		String title=driver.getTitle();
		System.out.println("Title:"+title);
		
		//get current url
		String currentUrl=driver.getCurrentUrl();
		System.out.println("Current url:"+currentUrl);
		
		//get html page source
		
		String pageSource=driver.getPageSource();
		System.out.println("PageSource:"+pageSource);
		
		driver.quit();

	}

}
