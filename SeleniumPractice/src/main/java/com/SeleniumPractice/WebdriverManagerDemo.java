package com.SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverManagerDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*If we are not using webdrivermanager we need to download respective driver and put it in resources folder and 
		 * 
		 * syntax:
		 * System.setProperty("webdriver.chrome.driver","./Resources/chromedriver.exe");
		 * Webdriver driver = new cromeDriver();
		 * driver.get("url");
		 * 
		 */
		
		//automatic setproperty using webdrivermanager
		//WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://github.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.quit();

	}

}
