package com.SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
/*
 * sets the amount of time to wait for the page load complete before throwing an error
 * exception:timeoutexception
 * default time for page loadtimeout is 300seconds
 */

public class PageLoadTimeOutDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

		// to get default time use below line
		// System.out.println(driver.manage().timeouts().getPageLoadTimeout().toMillis());
//		Instant startTime=Instant.now();
//		System.out.println("Before oprning webpage:"+startTime.toString());
//		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
//		Instant endTime=Instant.now();
//		System.out.println("Time after opening :"+endTime.toString());
//		
//		Duration duration=Duration.between(startTime, endTime);
//		System.out.println("Pageload time:"+duration.toMillis()+ "milliSeconds");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
