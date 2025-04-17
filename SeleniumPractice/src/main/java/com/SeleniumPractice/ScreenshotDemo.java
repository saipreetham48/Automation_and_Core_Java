package com.SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScreenshotDemo {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.hyrtutorials.com/p/frames-practice.html");
		utils.Utils.captureScreenshots(driver, "img1.png");
//		TakesScreenshot ts=(TakesScreenshot) driver;
		//using file outputtype
//		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
//		File destFile=new File("./Screenshots/img1.png");
//		FileUtils.copyFile(sourceFile, destFile);
		
		//using bytes output type
//		byte[] byteArr=ts.getScreenshotAs(OutputType.BYTES);
//		FileOutputStream  fos=new FileOutputStream("./Screenshots/img2.jpg");
//		fos.write(byteArr);
		//using base64 outputtype
//		String base64Code=ts.getScreenshotAs(OutputType.BASE64);
//		byte[] byteArr=Base64.getDecoder().decode(base64Code);
//		File destFile=new File("./Screenshots/img3.png");
//		FileOutputStream fos=new FileOutputStream(destFile);
//		fos.write(byteArr);
		driver.quit();
		
		

	}

}
