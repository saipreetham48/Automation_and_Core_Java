package utils;

import java.io.File;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utils {

	public static void captureScreenshots(WebDriver driver,String fileName) throws Exception {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		File destFile=new File("./Screenshots/"+fileName+"");
		
		//FileUtils.copyFile(sourceFile, destFile);
		
	}

}
